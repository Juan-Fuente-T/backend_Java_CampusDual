package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.text.Normalizer;

import static java.text.Normalizer.normalize;

/**
 * Representa un contacto con nombre, apellidos, teléfono y un código único.
 * Implementa la interfaz {@link ICallActions} para proporcionar acciones relacionadas con llamadas.
 */
public class Contact implements ICallActions {

    private String name;
    private String surnames;
    private String phone;

    /**
     * Un código único generado para el contacto, utilizado para identificación y recuperación.
     */
    private String code;

    /**
     * Crea un nuevo Contacto con el nombre, apellidos y teléfono especificados.
     * Genera automáticamente un código único para el contacto.
     *
     * @param name     El nombre del contacto.
     * @param surnames Los apellidos del contacto.
     * @param phone    El número de teléfono del contacto.
     */

    public Contact(String name, String surnames, String phone) {
        this.name = name;
        this.surnames = surnames;
        this.phone = phone;
        this.code = contactCodeGenerator(name, surnames);
    }

    public String getName() {
        return this.name;
    }

    public String getSurnames() {
        return this.surnames;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getCode() {
        return this.code;
    }


    /**
     * Implementación de la interfaz ICallActions. Realiza una llamada al propio número del contacto.
     */
    @Override
    public void callMyNumber() {
        Contact myself = new Contact("Juan", "Fuente", "555666777");
        System.out.println("Mi nombre es " + myself.getName() + " " + myself.getSurnames() + ". El telefono es " + myself.getPhone());
    }

    /**
     * Implementación de la interfaz ICallActions. Realiza una llamada a un número de teléfono especificado.
     *
     * @param number El número de teléfono al que se desea llamar.
     */
    @Override
    public void callOtherNumber(String number) {
        Contact myself = new Contact("Juan", "Fuente", "555666777");
        System.out.println("Yo, " + myself.getName() + " " + myself.getSurnames() + ", estoy llamando al numero " + number + "\n");
    }

    /**
     * Muestra toda la información relativa del contacto.
     */
    @Override
    public void showContactDetails() {
        // System.out.println("Información de contacto: " + this.getName() + " " + this.getSurnames() + ", teléfono " + this.getPhone() + ", código  " + this.getCode() + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre ");
        sb.append(this.getName());
        sb.append(" ");
        sb.append(this.getSurnames());
        sb.append(". Telefono ");
        sb.append(this.getPhone());
        sb.append(". Codigo ");
        sb.append(this.getCode());
        sb.append("\n");

        System.out.println(sb.toString());
    }

    /**
     * Genera un código único para el contacto a partir de su nombre y apellidos.
     *
     * @param name     El nombre del contacto.
     * @param surnames Los apellidos del contacto.
     * @return Un código único para el contacto.
     */
    public String contactCodeGenerator(String name, String surnames) {
        String nameMin = name.toLowerCase();
        String surnamesMin = surnames.toLowerCase();

        StringBuilder codigoBuilder = new StringBuilder();
        String[] partesApellido = surnamesMin.split(" ");

        if (partesApellido.length > 1) {
            codigoBuilder.append(partesApellido[0].charAt(0)); // Primera letra del primer apellido
            for (int i = 1; i < partesApellido.length; i++) {
                codigoBuilder.append(partesApellido[i]); // Resto de los apellidos
            }
        } else {
            codigoBuilder.append(surnamesMin); // Si solo hay un apellido
        }

        //return normalize(("" + nameMin.charAt(0) + codigoBuilder), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        //return normalize(("" + nameMin.charAt(0) + codigoBuilder), Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        return normalize(("" + nameMin.charAt(0) + codigoBuilder), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}", "");
    }

    /**
     * Muestra un menú con opciones para realizar acciones con el contacto:
     * 1. Llamarse a sí mismo.
     * 2. Llamar a otro número.
     * 3. Mostrar detalles del contacto.
     * 4. Salir del menú.
     */
    public void contactMenu() {

        int contactOption;

        do {
            contactOption = Utils.integer(
                    "Seleccione una de las siguientes opciones: "
                            + "\n (1) Llamarse a si mismo. "
                            + "\n (2) Llamar a otro número"
                            + "\n (3) Mostrar detalles del contacto."
                            + "\n (4) Salir del menú."
                            + "\n");
            switch (contactOption) {
                case 1:
                    this.callMyNumber();
                    break;
                case 2:
                    this.callOtherNumber(Utils.string("Introduce el número al que quieras llamar" + "\n"));
                    break;
                case 3:
                    this.showContactDetails();
                    break;
                case 4:
                    System.out.println("Saliendo del menú." + "\n");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo" + "\n");
            }
        } while (contactOption != 4);
    }
}
