package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> newStack = new Stack<>();
            String[] elements= {"Smith", "Montessori","Peralta", "House"};
            for(String s: elements){
                newStack.push(s);
          }
            //newStack.addAll(Arrays.asList(elements));
            return newStack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        int size = stack.size();
        System.out.println("El elemento en la cima de la pila es :" + stack.peek() + "\n");
        for (int i = 0; i < size; i++){
            System.out.println("Este es el último elemento de la pila: " + stack.pop() + "\n");
        }
    }

    public static void main(String[] args) {
        Stack<String> s = createStack();
        printAndEmptyStack(s);
    }



}
