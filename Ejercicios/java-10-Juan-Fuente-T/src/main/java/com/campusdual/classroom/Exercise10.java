package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {

        int blueBallCount = 0;

        while(blueBallCount < 2){
            String ball = getBall();
            System.out.println("La bola es de color: " + ball);
            if(ball.equals("azul")){
                blueBallCount+=1;
            }
        }
        System.out.println("La bola se encontró dos veces.");
    }

//    public static String getBall() {
//        int numColor = randomWithRange(1, 4);
//        String colorBall = "azul";
//        if (numColor == 2){
//            return colorBall;
//        }else {
//            switch (numColor) {
//                case 1:
//                    colorBall = "rojo";
//                    break;
//                case 3:
//                    colorBall = "verde";
//                    break;
//                default:
//                    System.out.println("No es un número válido");
//            }
//        }
//        return colorBall;
//    }
    //Variante "normal"
    public static String getBall() {
        int numColor = randomWithRange(1, 4);
        String colorBall = "azul";
        switch (numColor){
            case 1: colorBall = "rojo";
                break;
            case 3: colorBall = "verde";
                break;
            default:
                System.out.println("No es un número válido");
        }
        return colorBall;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}