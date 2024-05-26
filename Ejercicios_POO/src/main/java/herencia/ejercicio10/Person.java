package main.java.herencia.ejercicio10;

public class Person {
    //Atributos
    protected String name;
    protected String surName;
    //Constructores
    public Person(String name, String surname) {
        this.name = name;
        this.surName = surname;
    }
    //Getters y setters
    public void getDetails(){
        System.out.println("Nombre completo " + this.name + " " + this.surName);
    }
}
