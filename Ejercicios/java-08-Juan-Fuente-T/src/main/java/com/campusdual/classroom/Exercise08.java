package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop (7);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        int x = 0;
        while(x < num) {
            System.out.println(x  + " < " + num + ". El próximo ciclo valdrá: " + (x + 1));
            System.out.println((x + 1) + " < " + num + ". El próximo ciclo valdrá: " + (x + 2));
            x++;
        }
    }
}