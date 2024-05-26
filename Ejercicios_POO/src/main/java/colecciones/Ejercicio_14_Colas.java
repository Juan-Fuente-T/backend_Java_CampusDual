package main.java.colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio_14_Colas {
    public static void main(String[] args) {
        Queue<String> customQueue = new LinkedList<>();

        customQueue.offer("Smith");
        customQueue.offer("Montessori");
        customQueue.offer("Peralta");
        customQueue.offer("House");

        System.out.println("Esto es el peek numero1. El primero de la lista es: " + customQueue.peek() + "\n");
        System.out.println("Esto es el peek numero2. El primero de la lista es: " + customQueue.peek() + "\n");
        System.out.println("Esto es el peek numero3. El primero de la lista es: " + customQueue.peek() + "\n");

//    while (!customQueue.isEmpty()){
//      System.out.println(customQueue.poll());
//    }

        System.out.println("Esto es el poll numero1. El primero de la lista es: " + customQueue.poll() + "\n");
        System.out.println("Esto es el poll numero2. El primero de la lista es: " + customQueue.poll() + "\n");
        System.out.println("Esto es el poll numero3. El primero de la lista es: " + customQueue.poll() + "\n");

        System.out.println("Numero de elementos ahora " + customQueue.size());
    }
}
