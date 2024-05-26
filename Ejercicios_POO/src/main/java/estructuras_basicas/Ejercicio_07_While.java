package main.java.estructuras_basicas;

public class Ejercicio_07_While {
    public static void main(String[] args) {
        int variableAEvaluar = 1;

        while(variableAEvaluar < 5) {
            System.out.println("La variable a evaluar aun es menor que 5, porque vale " + variableAEvaluar);
            variableAEvaluar++;
        }
        for(int i = 1; i < 5; i ++){
            System.out.println("La variable a evaluar aun es menor que 5, porque vale " + i);
        }

        //Ejemplo de do-while
        int variableAEvaluar2 = 6;
        do{
            System.out.println("La variable a evaluar vale " + variableAEvaluar2);
            variableAEvaluar2--;
        }while(variableAEvaluar2 > 1);
    }
}
