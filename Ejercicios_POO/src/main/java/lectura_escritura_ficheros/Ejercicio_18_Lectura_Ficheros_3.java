package main.java.lectura_escritura_ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_18_Lectura_Ficheros_3 {

    //ESTA ES UNA FORMA MAS OPTIMIZADA DE REALIZAR EL EJERCICIO ANTERIOR(18_2)
    //PORQUE USA TRY-WITH-RESOURCES
    public static void main(String[] args) {
        //el TRY-WITH-RESOURCES ya inicializa los flujos y automaticamente los cierra al final.
        //Ahorra codigo, es la que se debe usar
        try (BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/fichero.txt")))){
            String linea = "";
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
