package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
//        Car coche = new Car("Citroen", "Xsara", "Diesel");
//
//        coche.showDetails();
//
//        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
//        coche.start();
//        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
//        coche.start();
//        coche.accelerate();
//        //Apagar el coche comprobando que el valor del tacómetro es correcto
//        coche.stop();
//        System.out.println("¿Está el tacómetro a cero?:" + coche.isTachometerEqualToZero());
//        //Acelerar el coche
//        coche.accelerate();
//        while(coche.speedometer < 120){
//            coche.accelerate();
//        }
//        System.out.println("Velocidad del coche: " + coche.speedometer);
//        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
//        coche.accelerate();
//        //Frenar la velocidad
//        while(coche.speedometer > 0){
//            coche.brake();
//        }
//        System.out.println("Velocidad del coche: " + coche.speedometer);
//        //Frenar hasta un valor negativo (y comprobar que no se puede)
//        coche.brake();
//        //Girar el volante 20 grados
//        coche.turnAngleOfWheels(20);
//        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
//        coche.turnAngleOfWheels(45);
//        coche.turnAngleOfWheels(-45);
//        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
//        coche.accelerate();
//        coche.setReverse(true);
//        //Detener el coche y poner marcha atrás
//        coche.brake();
//        coche.setReverse(true);
//        coche.stop();
//    }
//}
//
// Soluccion Alberto
        //instanciar objetos de tipo ``Car``
        Car cocheCitroen = new Car("Citroen", "Xsara Picasso", "Diesel");
        Car cocheSeat = new Car("Seat", "Leon", "Gasolina");

        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        cocheSeat.start();
        //
        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        cocheSeat.start();
        //
        //Apagar el coche comprobando que el valor del tacómetro es correcto
        cocheSeat.stop();

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        cocheCitroen.start();
        cocheCitroen.accelerate();
        cocheCitroen.stop();

        //Acelerar el coche
        cocheCitroen.accelerate();
        cocheSeat.start();

        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        while (cocheSeat.startOn && cocheSeat.speedometer < cocheSeat.MAX_SPEED) {
            cocheSeat.accelerate();
            if (cocheSeat.speedometer == cocheSeat.MAX_SPEED) {
                System.out.println("El coche " + cocheSeat.brand + " " + cocheSeat.model
                        + " ha alcanzado la velocidad maxima permitida.");
                break;
            }
        }

        //Frenar la velocidad
        cocheSeat.brake();

        //Frenar hasta un valor negativo (y comprobar que no se puede)
        while (cocheCitroen.speedometer >= 0) {
            cocheCitroen.brake();
            if (cocheCitroen.speedometer == 0) {
                System.out.println("A velocidade do vehículo " + cocheCitroen.brand + " " + cocheCitroen.model
                        + " é cero");
                break;
            }
        }

        //Girar el volante 20 grados
        cocheSeat.turnAngleOfWheels(20);

        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        cocheSeat.turnAngleOfWheels(50);

        //Detener el coche y poner marcha atrás
        while (cocheCitroen.speedometer > 0) {
            cocheCitroen.brake();
        }

        cocheCitroen.setReverse(true);

        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        cocheCitroen.accelerate();
        cocheCitroen.setReverse(true);
    }
}