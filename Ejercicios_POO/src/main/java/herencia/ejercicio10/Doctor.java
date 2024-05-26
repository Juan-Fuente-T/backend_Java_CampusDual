package main.java.herencia.ejercicio10;

public class Doctor extends Person{
    protected String specialization;

    public Doctor(String name, String surName, String specialization) {
        super(name, surName);
        this.specialization = specialization;
    }
    @Override
    public void getDetails(){

    }
}
