package com.campusdual.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> newHashSet = new HashSet<>();

            String[] options =
                    {"ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD", "ELEMENT WFGEJ",
                            "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"};
            for (int i = 0; i < options.length; i++) {
                newHashSet.add(options[i]);
            }
            //newHashSet.addAll(Arrays.asList(options));
        return newHashSet;
    }

    public static Set<String> createTreeSet() {
        String[] options =
                {"ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD", "ELEMENT WFGEJ",
                        "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"};
        return new TreeSet<>(Arrays.asList(options));
    }

    private static void printSet(Set<String> customSet) {
        for (String cs : customSet) {
            System.out.println(cs);
        }
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        try {
            set.add(elementToAdd);
            return true;
        } catch (Exception e) {
            System.out.println("No se pudo agregar el elemento al Set");
            return false;
        }
    }

    public static void main(String[] args) {
        Set<String> cocidoHashSet = createHashSet();
        Set<String> newTreeSet = createTreeSet();

        boolean agregadoHashSet = addElementToSet(cocidoHashSet, "ELEMENT XXXXX");
        System.out.println("Se ha agregado el valor: " + agregadoHashSet);
        boolean agregadoTreeSet = addElementToSet(newTreeSet, "ELEMENT YYYYY");
        System.out.println("Se ha agregado el valor: " + agregadoTreeSet);

        printSet(cocidoHashSet);
        System.out.println("\n");
        printSet(newTreeSet);
    }
}
