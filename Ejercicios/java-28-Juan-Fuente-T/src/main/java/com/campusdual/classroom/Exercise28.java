package com.campusdual.classroom;

public class Exercise28 {
    public static int metodoprueba(int num){
        if (num < 2){
            throw new ArithmeticException("No debe ser un número menor a 2");
        }
        int newNum = 0;
//        try{
//           newNum = 100/ num;
//        }catch (Exception e){
//            System.out.println("No se ha podido realizar la división");
//        }finally {
//            System.out.println("El programa ha finalizado");
//        }
        return newNum = num * 2;
    }

    public static void main(String[] args) {
            int num = metodoprueba(2);
            int divisor = 2;
            if(num/divisor < 4){
                throw new ArithmeticException();
            }
    }
}