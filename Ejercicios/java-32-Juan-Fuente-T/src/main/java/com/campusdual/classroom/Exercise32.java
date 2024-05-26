package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.*;

public class Exercise32 {

    public static void main(String[] args) {
        String texto = Utils.string("Introduce el texto que desees guardar\n");
        String textoIntroducido = generateStringToSave(texto);
        if (textoIntroducido.isEmpty()) {
            generateUserInputToSave();
        }
        printToFile(textoIntroducido);
    }

    public static String generateStringToSave(String string) {
        if (string == null) {
            string = generateUserInputToSave() ;
        }
        return string;
    }

    private static String generateUserInputToSave() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Escribe debajo el texto que quieras. Pulsa \"ENTER\" 2 veces seguidas para finalizar:");
        String string;
        while (!(string = Utils.string()).isEmpty()) {
            sb.append(string).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void printToFile(String string) {
        File ficheroTexto = new File("src/main/resources/data.txt");
        try (PrintWriter pw = new PrintWriter(new FileWriter(ficheroTexto))) {
                pw.println(string);
        } catch (IOException e) {
            System.out.println("ERROR: ha habido un problema al acceder al fichero de texto");
        }
        readToFile();
    }

    //No es necesario este metodo, solo es para comprobación de que se haya escrito el texto
    public static void readToFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(("src/main/resources/data.txt")))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: no se ha encontrado el fichero");
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println("ERROR: ha fallado la lectura del fichero");
            ex.printStackTrace();
        }
    }

}



