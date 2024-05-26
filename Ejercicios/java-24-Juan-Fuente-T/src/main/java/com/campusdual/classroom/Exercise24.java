package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> newQueue = new LinkedList<>();
        String[] elements= {"Smith", "Montessori","Peralta", "House"};

        for(String s: elements){
            newQueue.offer(s);
        }
        return newQueue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++){
            System.out.println("Esto es el poll numero1. El primero de la lista es: " + queue.poll() + "\n");
        }
    }

    public static void main(String[] args) {
        Queue<String> q = createQueue();
        printAndEmptyQueue(q);
    }

}
