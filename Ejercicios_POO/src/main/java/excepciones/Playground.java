package main.java.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Playground {
    public void readFile() throws IOException {
        File file = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String readLine = "";

        System.out.println("Contenido del fichero:\n");

        while ((readLine = br.readLine()) != null) {
            System.out.println(readLine);
        }
    }//readFile()

    public static void main(String[] args) {
        Playground p = new Playground();

        try {
            p.readFile();
        } catch (IOException e) {
            System.out.println("Se produjo una excepcion!");
            e.printStackTrace();
        } finally {
            System.out.println("\nFin del programa");
        }
    }
}
