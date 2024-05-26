package main.java.lectura_escritura_ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio_19_Escritura_Ficheros {
    public static void main(String[] args) {
        File ficheroTexto = new File("src/main/resources/fichero_escritura.txt");
        //try(PrintWriter pw = new PrintWriter(new FileWriter(ficheroTexto))) {
        //sin usar true, no hay append y cada vez que se ejecuta la clase se sobreescribe el texto
        try(PrintWriter pw = new PrintWriter(new FileWriter(ficheroTexto, true))) {
            ficheroTexto.createNewFile();
            //pw.println("Y esto es la ultima linea que meto hoy, en la clase del 20-03-2024.");

            for (int i = 0; i < 10; i++) {
                pw.println("Linea: " + i);
            }
            
        } catch (IOException e) {
            System.out.println("ERROR: ha habido un problema al crear o acceder al fichero de texto");
//        }finally {
//            //si interesara borrarla esto lo hace una vez se termine el programa
//            ficheroTexto.deleteOnExit();
        }
    }
}
