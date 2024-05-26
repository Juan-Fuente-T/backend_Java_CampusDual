package main.java.interfaces;

public class Tractor implements IMachine{
    protected int horsepower = 0;

    public Tractor(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void start() {
        System.out.println("Avión encendido.");
    }

    @Override
    public void stop() {
        System.out.println("Avión apagado.");
    }

    @Override
    public void maintenance() {
        System.out.println("Realizando mantenimiento del avión.");
    }
    public String getDetails(){
        return ("La potencia del tractor es de " + this.horsepower + " HP");
    }
    public void forward(){
        System.out.println("El tractor avanza.");
    }
    public void backward(){
        System.out.println("El tractor retrocede.");
    }
}
