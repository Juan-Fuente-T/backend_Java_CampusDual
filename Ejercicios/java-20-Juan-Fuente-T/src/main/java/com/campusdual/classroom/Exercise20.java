package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> personList = new ArrayList<>(4);
        personList.add(new Person("Malvino", "Caro-Aguado"));
        personList.add(new Teacher("Paola", "Picero", "Educacion"));
        personList.add(new PoliceOfficer("Alejandro", "Gadicto", "Fontiñas"));
        personList.add(new Doctor("Alfredo", "Lores", "Curacion a domicilio"));

        return personList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person p: stringList) {
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
