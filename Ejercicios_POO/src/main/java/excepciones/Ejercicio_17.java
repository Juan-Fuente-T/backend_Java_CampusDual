package main.java.excepciones;

public class Ejercicio_17 {
    public static int division(int dividendo, int divisor) throws ByZeroException {
        if (divisor == 0) {
            throw new ByZeroException("Se ha intentado dividir entre cero.");
        } else {
            return dividendo / divisor;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(division(3, 0));
        } catch (ByZeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("El programa ha finalizado.");
    }
}
