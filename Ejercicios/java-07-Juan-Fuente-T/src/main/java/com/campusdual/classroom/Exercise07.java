package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {
    public static void main(String[] args) {
        positionInAList(5);
        positionInAList(17);
        positionInAList(12);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(7);
    }
    //*Dada una List<Integer> de elementos con los números del 10 al 0, buscar el elemento
    // quese le pasa por parámetro. Para recorrer la lista, se tomará toda su extensión, usando "size()".
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se ha encontrado."
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.*/
    public static void positionInAList(int num) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        //Solucion Alberto(profesor)
        String resultadoBusqueda= "El elemento " + num + " no se encuentra en la lista.";
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == num){
                resultadoBusqueda = "El elemento " + num + " se ha encontrado.";
                break;
            }
        }
        System.out.println(resultadoBusqueda);
    }
        //Mi solucion adaptado a esta lista en concreto
        /*if (num < list.size()) {
            for(int i = 0; i < list.size(); i++) {
                if (list.get(i) == num) {
                    System.out.println("El elemento " + num + " se ha encontrado.");
                    break;
                }
            }
        }
        else{
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }*/
        //Mi solucion (podria optimizarse un poco)
        /*boolean encontrado = false;
        for(int i = 0; i < list.size(); i++) {
            if (num < list.size()) {
                if (list.get(i) == num) {
                    System.out.println("El elemento " + num + " se ha encontrado.");
                    encontrado = true;
                    break;
                }
            }
        }
        if(!encontrado){
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }*/

    public static void sumFirstNaturalNumbers(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++){
            result+=i;
        }
        System.out.println(result);
    }

    public static void showFirstNaturalNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            //System.out.println(i);
            System.out.print(i + " ");
        }

    }

}
