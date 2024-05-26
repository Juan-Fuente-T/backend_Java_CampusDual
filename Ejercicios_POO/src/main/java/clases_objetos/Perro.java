package main.java.clases_objetos;
//atributos
public class Perro {
    private int altura;
    boolean isDePeloLargo;
    private String raza;
    private String nombre;
    private String color;

  //getters y setters

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isDePeloLargo() {
        return this.isDePeloLargo;
    }

    public void setDePeloLargo(boolean dePeloLargo) {
        this.isDePeloLargo = dePeloLargo;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Resto de metodos
    protected void ladrar() {
        System.out.println("Guau! Guau!");
    }

    public void showDetails() {
        this.ladrar();
        System.out.println("Me llamo " + this.getNombre());
    }
}
