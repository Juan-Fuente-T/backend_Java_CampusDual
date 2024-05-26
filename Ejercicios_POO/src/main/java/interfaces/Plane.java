package main.java.interfaces;

public class Plane implements IMachine{
    private final String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Avión encendido");
    }

    @Override
    public void stop() {
        System.out.println("Avión apagado");
    }

    @Override
    public void maintenance() {
        System.out.println("Realizando mantenimiento del avión");
    }
}
