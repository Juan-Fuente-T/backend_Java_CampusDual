package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args) {
        //TRY-WITH-RESOURCES cierra el flujo al final.
        try (BufferedReader br = new BufferedReader(new FileReader(("src/main/resources/lorem.txt")))){
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