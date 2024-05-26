package main.java.excepciones;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int dividendo = 3, divisor = 0;
        try {
            int res = dividendo / divisor;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("Programa acabado");
        }
    }
}
