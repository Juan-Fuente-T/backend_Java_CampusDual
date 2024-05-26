package main.java.herencia.ejercicio10;

public class PoliceOfficer extends Person{
    //Atributos
    protected String squad;

    //Constructor
    public PoliceOfficer(String name, String surName, String squad) {
        super(name, surName);
        this.squad = squad;
    }
}
