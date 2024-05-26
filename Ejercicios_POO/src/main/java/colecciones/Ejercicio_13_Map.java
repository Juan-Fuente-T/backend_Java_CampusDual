package main.java.colecciones;

import main.java.herencia.ejercicio10.Doctor;
import main.java.herencia.ejercicio10.Person;
import main.java.herencia.ejercicio10.PoliceOfficer;
import main.java.herencia.ejercicio10.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio_13_Map {
    public static void main(String[] args) {
        Map<String, Person> customMap = new HashMap<>();

        customMap.put("person", new Person("John", "Smith"));
        customMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        customMap.put("police", new PoliceOfficer("Jack", "Peralta", "B-99"));
        customMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        customMap.get("teacher").getDetails();
        customMap.remove("teacher");

        System.out.println("Contiene la clave \"police\": " + customMap.containsKey("police"));
        System.out.println("Contiene la clave \"teacher\": " + customMap.containsKey("teacher"));
    }

}
