package main.java.lectura_escritura_ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_18_Lectura_Ficheros {
    public static void main(String[] args) {
        //Primero creamos una instancia del fichero usando File
        //En File indicamos la ruta que tendra el fichero
        File ficheroTexto = new File("src/main/resources/fichero.txt");

        FileReader fr = null; //es necesario declarar fr y br fuera del try/catch para que el finally tenga acceso,
        // debido al que si esta dentro del try está fuera del alcance del dominio
        BufferedReader br = null;
        try {
        //Instanciamos la clase FileReader, que será quien lea lo que contiene el fichero
            fr = new FileReader(ficheroTexto);
            //Usaremos un BufferedReader para gestionar mejor la lectura de datos que lee
            //el FileReader
            br = new BufferedReader(fr);

            //Usamos un while para que el FileReader vaya leyendo el fichero linea a linea

            String linea = "";
            while (linea != null){ //mientras haya lineas de texto lee. Sale si se acaba el texto
                linea = br.readLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: no se ha encontrado el fichero");
            e.printStackTrace();
        }catch (IOException ex){
            System.out.println("ERROR: ha fallado la lectura del fichero");
            ex.printStackTrace();
        }finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                System.out.println("ERROR: no se ha podido cerrar algun flujo");            }
        }
    }
}
