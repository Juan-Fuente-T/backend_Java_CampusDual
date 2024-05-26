package main.java.herencia.ejercicio10;

public class Teacher extends Person{
    protected String area;

    public Teacher(String name, String surName, String area) {
        super(name, surName);
        this.area = area;
    }
}
