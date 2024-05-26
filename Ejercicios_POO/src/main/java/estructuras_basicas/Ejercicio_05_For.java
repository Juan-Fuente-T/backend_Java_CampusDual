package main.java.estructuras_basicas;

public class Ejercicio_05_For {
    public static void main(String[] args) {
        /*
        * Sintaxis de for:
        * El bucle for consta de 3 partes:
        * Una expresion de incializacion(se declara una variable y se asigna un valor incial)
        * Una expresion de condicion que hara que el bucle se mantenga mientas se cumpla
        * Una expresion de incremento o decremento sobre la variable inicial
        * El codigo dentro de las llaves se repetira con cada iteracion
        */
        for (int i = 5; i > 0; i--){
            System.out.println("la variable i es menor que 5. i vale " + i);
        }
        for (int i = 0; i < 5; i++){
            System.out.println("la variable i es menor que 5. i vale " + i);
        }

    }
}
