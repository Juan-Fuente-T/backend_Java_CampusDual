package main.java.colecciones;

import main.java.herencia.ejercicio10.Doctor;
import main.java.herencia.ejercicio10.Person;
import main.java.herencia.ejercicio10.PoliceOfficer;
import main.java.herencia.ejercicio10.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_11_List {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        //Añado el objeto a la lista
        personList.add(new Person("John", "Smith"));
        personList.add(new Teacher("Maria", "Montessori", "Educacion"));
        personList.add(new PoliceOfficer("Jack", "Peralta", "B-99"));
        personList.add(new Doctor("Gregory", "House", "Nefrologia e infectologia"));
        for (Person p : personList) {
            p.getDetails();
        }
    }
//    -ArrayList: Permite elementos duplicados.
//    -HashSet: No permite elementos duplicados, no mantiene el orden de inserción.
//    -LinkedHashSet: No permite elementos duplicados, mantiene el orden de inserción.
//    -TreeSet: No permite elementos duplicados, mantiene los elementos ordenados.
}

