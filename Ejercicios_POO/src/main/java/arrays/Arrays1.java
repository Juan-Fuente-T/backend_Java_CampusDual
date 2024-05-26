package main.java.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //Declaracion e inicializacion de los arrays
        int [] intArray = new int[3];
        String [] stringArray = {"1", "2", "3"};

//Establecer datos del array
        intArray[0] = 10;
        intArray[1] = 9;
        intArray[2] = 8;

//Mostrar datos de posiciones del array
        System.out.println(intArray[0]);
        System.out.println(stringArray[0]);

//Mostrar la longitud del array
        System.out.println(intArray.length);
        System.out.println(stringArray.length);
    }
}
