package main.java.colecciones;

import java.util.Stack;

public class Ejercicio_15_Pilas {
    public static void main(String[] args) {
        Stack<String> customQueue = new Stack<>();

        customQueue.push("Smith");
        customQueue.push("Montessori");
        customQueue.push("Peralta");
        customQueue.push("House");

        //customQueue.add("hola");//no se usa, mejor descartar

        System.out.println("Esto es el peek numero1. El primero de la pila es: " + customQueue.peek() + "\n");
        System.out.println("Esto es el peek numero2. El primero de la pila es: " + customQueue.peek() + "\n");
        System.out.println("Esto es el peek numero3. El primero de la pila es: " + customQueue.peek() + "\n");


//        while(!customQueue.isEmpty()){
//            customQueue.pop();//recoge el valor y lo borra de la pila
//            System.out.println(customQueue);
//        }

        System.out.println("Esto es el pop numero1. El primero de la pila es: " + customQueue.pop() + "\n");
        System.out.println("Esto es el pop numero2. El primero de la pila es: " + customQueue.pop() + "\n");
        System.out.println("Esto es el pop numero3. El primero de la pila es: " + customQueue.pop() + "\n");
        System.out.println("Esto es el pop numero3. El primero de la pila es: " + customQueue.pop() + "\n");
        System.out.println(customQueue.size());
    }
}
