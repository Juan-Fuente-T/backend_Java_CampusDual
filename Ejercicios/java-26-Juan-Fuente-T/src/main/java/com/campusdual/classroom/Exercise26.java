package com.campusdual.classroom;


import java.util.HashMap;
import java.util.Map;

public class Exercise26 {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        testPhoneBookFilled(phonebook);
        phonebook.phonebookMenu();
    }
    private static void testPhoneBookFilled(Phonebook phonebook) {
        Map<String, Contact> agenda = new HashMap<>();

        agenda.put("jlopez", new Contact("Javier", "López", "124678"));
        agenda.put("rperez", new Contact("Ramón", "Pérez", "135790"));
        agenda.put("msantana", new Contact("María", "Santana", "246831"));

        phonebook.setData(agenda);
    }
}



