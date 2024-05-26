package main.java.clases_objetos;

public class Ejercicio_09_Car {

    public static void main(String[] args) {
        //Crear un objeto de tipo Car llamado citroen
        Car citroen = new Car("citroen", "Saxo", "gasoil");
        //Crear un nuevo coche llamado seat
        Car seat = new Car("seat", "León", "gasolina");
        //Encender el citroen
        citroen.start();
        //Encender el seat
        seat.start();
        //Apagar el seat
        seat.stop();
        //Acelerar el citroen hasta los 40Km/h (vamos por zona urbana, no seas animal)
        while (citroen.speedometer < 40) {
            citroen.accelerate();
        }
        System.out.println("La velocidad actual del citroen es " + citroen.speedometer);

        //Acelerar el seat hasta los 60Km/h (Autopista: somos ricos para el peaje)
        seat.start();
        while (seat.speedometer < 120) {
            seat.accelerate();
        }
        System.out.println("La velocidad actual del seat es " + seat.speedometer);
        //Frenar el seat (que ya está apagado, por tanto debería avisar de ello)
            seat.brake();
            System.out.println("La velocidad actual del citroen es " + seat.speedometer);
        //Frenar el citroen hasta los 30Km/h
        while (citroen.speedometer > 30) {
            citroen.brake();
        }
            System.out.println("La velocidad actual del citroen es " + citroen.speedometer);
        ;
        //Girar el volante del citroen 45 grados hacia la derecha (es una curva cerrada)
        citroen.turnSteeringWheel(45);
        //Girar el volante del citroen 45 grados hacia la izquierda
        citroen.turnSteeringWheel(-45);
    }
}

/*
Car peugeot = new Car("Peugeot", "3008", "electrico");
Car dacia = new Car("Dacia", "Sandero", "electrico");
Car ford = new Car("Ford", "Focus", "gasolina");
Car renault = new Car("Renault", "Megane", "gasoil");
 */