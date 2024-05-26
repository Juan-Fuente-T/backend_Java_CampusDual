package main.java.colecciones;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio_12_Set {
    public static void main(String[] args) {
        Set<String> customSet = new HashSet<>();{
            customSet.add("Libreta");
            customSet.add("Boligrafo");
            customSet.add("Lapiz");
            customSet.add("Lapiz1");
            customSet.add("Lapiz2");
            customSet.add("Lapiz3");
            customSet.add("Lapiz4");
            customSet.add("Lapiz5");
            customSet.add("Goma1");
            customSet.add("Goma2");
            customSet.add("Goma3");
            customSet.add("Goma4");

            customSet.remove("Boligrafo");

            for (String s: customSet){
                System.out.println(s);
            }
        }
    }
}
