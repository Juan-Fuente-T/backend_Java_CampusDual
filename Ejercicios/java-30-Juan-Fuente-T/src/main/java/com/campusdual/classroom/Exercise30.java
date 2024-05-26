package com.campusdual.classroom;

public class Exercise30 {
                                  //ES Necesario usar DivisionByZeroException para pasar el test//
    public static int divisionWithCustomException(int dividend, int divisor) {
        if (divisor != 0){
            return dividend/divisor;
        }else{
            throw new DivisionByZeroException("No se puede dividir por cero");
        }

//        int[] arrayNum = {1, 2, 3, 4};
//
//        if (dividend / divisor < 5) {
//            return arrayNum[dividend / divisor];
//        } else {
//            throw new IndexOutOfLimitsException("El indice esta fuera de los límites del array");
//        }
    }

    public static void main(String[] args) {
        try{
            int num = divisionWithCustomException(7,0);
            System.out.println("Numero = " + num);
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }

//        try {
//            int num = divisionWithCustomException(6, 1);
//            System.out.println("Numero = " + num);
//        } catch (IndexOutOfLimitsException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("Programa finalizado");
    }
}