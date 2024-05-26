package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa una agenda telefónica que almacena contactos y permite realizar acciones sobre ellos.
 */
public class Phonebook {
    /**
     * Almacena los contactos de la agenda en un mapa (HashMap) donde la clave es el código del contacto
     * y el valor es el objeto Contact.
     */
    private Map<String, Contact> data = new HashMap<>();

    public Map<String, Contact> getData() {
        return this.data;
    }

    public void setData(Map<String, Contact> data) {
        this.data = data;
    }

    /**
     * Agrega un nuevo contacto a la agenda.
     **/
    public void addContact() {
        String name = Utils.string("Introduce el nombre del contacto" + "\n");
        String surnames = Utils.string("Introduce los apellidos del contacto" + "\n");
        String phone = Utils.string("Introduce el teléfono del contacto" + "\n");

        if (name.isBlank() || surnames.isBlank() || phone.isBlank()) {
            System.out.println("No se ha podido guardar el contacto. No se admiten campos en blanco." +
                    " Inténtelo de nuevo\n");
        }
//        else {
//            Contact newContact = new Contact(name, surnames, phone);
//
//            this.getData().put(newContact.getCode(), newContact);
//            System.out.println("Se ha añadido el contacto " + newContact.getName() + "\n");
//            newContact.showContactDetails();
//        }
        Contact newContact = new Contact(name, surnames, phone);
        this.addContact(newContact);
    }
    public void addContact(Contact contact){

        this.getData().put(contact.getCode(), contact);
        System.out.println("Se ha añadido el contacto " + contact.getName() + "\n");
        contact.showContactDetails();
    }

    /**
     * Muestra todos los contactos almacenados en la agenda.
     */
    public void showPhonebook() {
        for (Map.Entry<String, Contact> entry : this.getData().entrySet()) {
            entry.getValue().showContactDetails();
        }
    }

    /**
     * Elimina un contacto de la agenda utilizando su código como identificador.
     */
    public void deleteContact() {
        String selectedCode;
        do {
            selectedCode = Utils.string("Introduzca el código del contacto que desea eliminar." + "\n");
            if (!this.getData().containsKey(selectedCode)) {
                System.out.println("Código no válido, inténtelo de nuevo" + "\n");
            }
        } while (!this.getData().containsKey(selectedCode));
        Contact deletedContact = this.getData().remove(selectedCode);
        System.out.println("Has borrado a : " + deletedContact.getName()
                + " " + deletedContact.getSurnames() + "\n");
    }

    /**
     * Busca y muestra la información de un contacto específico utilizando su código como identificador.
     **/

    public void getContactSelectedByUser() {
        String selectedCode;
        do {
            selectedCode = Utils.string("Introduce el código del contacto que desea seleccionar\n");
            if (this.getData().containsKey(selectedCode)) {
                this.getData().get(selectedCode).contactMenu();
            } else {
                System.out.println("El código de contacto introducido no existe en el listín. " +
                        "Introduzca un código válido" + "\n");
            }
        } while (!this.getData().containsKey(selectedCode));
    }

    /**
     * Muestra un menú con opciones para realizar acciones con la agenda:
     * 1. Añadir un contacto.
     * 2. Seleccionar un contacto.
     * 3. Ver todos los contactos.
     * 4. Eliminar un contacto.
     * 5. Salir del menú.
     */

    public void phonebookMenu() {

        int phonebookOption;

        do {
            phonebookOption = Utils.integer("Seleccione una de las siguientes opciones: "
                    + "\n (1) Añadir un contacto. "
                    + "\n (2) Seleccionar un contacto."
                    + "\n (3) Ver todos los contactos. "
                    + "\n (4) Eliminar un contacto"
                    + "\n (5) Salir del menú."
                    + "\n");

            switch (phonebookOption) {
                case 1:
                    this.addContact();
                    break;
                case 2:
                    this.getContactSelectedByUser();
                    break;
                case 3:
                    this.showPhonebook();
                    break;
                case 4:
                    this.deleteContact();
                    break;
                case 5:
                    System.out.println("Saliendo del menú." + "\n");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo" + "\n");
            }
        } while (phonebookOption != 5);
    }

}
