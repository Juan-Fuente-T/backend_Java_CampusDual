package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>();
        String[] listElements =
                {"GKFFD", "TNANA", "MPMSL", "PSWME", "LZMLF", "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"};
        for (int i = 0; i < listElements.length; i++) {
            newArrayList.add(listElements[i]);
        }
        //newArrayList.addAll(Arrays.asList(listElements)); //esto puede sustituir al for
        return newArrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        int indexList = 0;
        for (String s: customList) {
            //System.out.println("El indice de " + s + " en la lista es " + indexList);
            System.out.println("El indice de " + s + " en la lista es " + customList.indexOf(s));
            //indexList++;
        }
        }

    public static boolean addElementToList(List<String> customList, String element) {
        try {
            customList.add(element);
            return true;
        } catch (Exception e) {
            System.out.println("El elemento no ha podido ser agregado.");
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> myArraylist = (ArrayList<String>) createArrayList();
        addElementToList(myArraylist,"AAAAA");
        printElementsAndIndex(myArraylist);
    }

}

