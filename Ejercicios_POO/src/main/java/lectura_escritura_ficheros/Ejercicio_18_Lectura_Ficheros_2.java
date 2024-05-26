package main.java.lectura_escritura_ficheros;

import java.io.*;

public class Ejercicio_18_Lectura_Ficheros_2 {

    //ESTA ES UNA FORMA UN POCO MAS OPTIMIZADA DE REALIZAR EL EJERCICIO ANTERIOR(18)
    //PERO FUNCIONA CASI IDENTICA
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/fichero.txt")));
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
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException exc) {
                System.out.println("ERROR: no se ha podido cerrar algun flujo");
                exc.printStackTrace();
            }
        }


    }
}
