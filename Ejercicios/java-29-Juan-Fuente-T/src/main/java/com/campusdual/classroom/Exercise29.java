package com.campusdual.classroom;

public class Exercise29 {
    static int[] numeros = {1, 2, 3, 4, 5, 6, 7};
    public static void main(String[] args) {
        try {
            int result = numeros[selectIndexArray(4)];
            System.out.println("Result = " + result);
        }catch (Exception e){
            System.out.println("El indice excede los límites del array");
        }
    }

    public static int selectIndexArray(int num) throws Exception {
        if (num * 2 > 6){
            throw new Exception();
        }else{
            return num * 2;
        }
    }
}
