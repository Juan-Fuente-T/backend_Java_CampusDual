package main.java.clases_objetos;

public class Car2 {

    //Atributos de la clase
    final int MAX_STEERING_WHEEL_RIGHT = -180; //constante del máximo valor de giro hacia la derecha

    final int MAX_STEERING_WHEEL_LEFT = 180; //constante del máximo valor de giro hacia la izquierda

    public String brand;
    String model;
    int maxSpeed;
    String fuel;
    int speedometer = 0;
    int tachometer = 0;
    boolean carOn = false; //los coches al crearlos se crean apagados
    int actualAngle = 0; //cuando construimos cada coche el volante está en el centro

    //Creamos un constructor para la clase Car
    public Car2(String brand, String model, int maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    //Creamos el método que permite arrancar(encender) el coche
    public void start() {
        if (this.carOn == false) { //comprobamos que el coche estaba apagado para poder encenderlo
            this.carOn = true; //con esto establecemos que el coche está en estado encendido
            System.out.println("El vehículo " + this.brand + " se acaba de encender");
        } else {
            System.out.println("El vehículo " + this.brand + " ya estaba encendido. No se puede encender otra vez.");
        }
    }

    //Creamos el método que permite apagar el coche
    public void stop() {
        if (this.carOn == true) { //comprobamos que el coche estaba encendido para poder apagarlo
            if (this.speedometer == 0) {
                this.carOn = false; //con esto establecemos que se apague el coche
                System.out.println("El vehículo " + this.brand + " se ha apagado");
            } else {
                System.out.println("El vehiculo " + this.brand + " está encendido pero no está detenido. Detenga el coche para apgarlo");
            }
        } else {
            System.out.println("El vehículo " + this.brand + " ya estaba apagado. No se puede apagar otra vez.");
        }
    }

    //Creamos el método que permite acelerar a un coche
    public void accelerate(int nuevaVelocidad) {
        if (this.carOn == true) { //comprobamos que el coche está encendido para poder acelerar
            if (this.speedometer < nuevaVelocidad
                    && this.maxSpeed >= nuevaVelocidad) { //si está encendido entra en el if, y luego comprueba si la velocidad nueva es correcta
                this.speedometer = nuevaVelocidad;
                System.out.println("El vehículo " + this.brand + " ha acelerado hasta " + nuevaVelocidad + "Km/h");
            } else {
                System.out.println("La velocidad del vehículo " + this.brand + " es " + this.speedometer
                        + ". No se puede acelerar hasta " + nuevaVelocidad);
            }
        } else { //si el coche está apagado
            System.out.println("El vehículo " + this.brand + " está apagado. No puede acelerar. Enciéndalo primero");
        }
    }

    //Creamos el método que permite frenar un coche
    public void brake(int nuevaVelocidad) {
        if (this.carOn == true) { //comprueba si el coche está encendido
            if (this.speedometer > nuevaVelocidad) { //si está encendido entra, y luego comprueba si la velocidad nueva es correcta
                this.speedometer = nuevaVelocidad;
                System.out.println("El vehículo " + this.brand + " ha frenado hasta " + nuevaVelocidad + "Km/h");
            } else { //si la velocidad nueva es mayor que la que ya circulamos, no podemos frenar
                System.out.println("La velocidad del vehículo " + this.brand + " es " + this.speedometer
                        + ". No se puede frenar hasta " + nuevaVelocidad);
            }
        } else { //si el coche está apagado
            System.out.println("El vehículo " + this.brand + " está apagado. No puede frenar. Enciéndalo primero");
        }
    }

    //Creamos el método que nos permite girar el volante
    //VAMOS A SUPONER EN TODOS LOS COCHES que el volante sólo puede girar como máximo 180 grados
    //GIROS A LA IZQUIERDA SON POSITIVOS. GIROS A LA DERECHA SON NEGATIVOS
    public void turnSteerWheel(int anguloGiro) {
        boolean isValidSumRight = this.actualAngle + anguloGiro >= this.MAX_STEERING_WHEEL_RIGHT;
        boolean isValidSumLeft = this.actualAngle + anguloGiro <= this.MAX_STEERING_WHEEL_LEFT;

        if (isValidSumRight && isValidSumLeft) { // -180 <= sumaTotal <= 180
            this.actualAngle = this.actualAngle + anguloGiro; //toma el valor actual del giro del volante y le añade el valor pasado por parámetro
            //que podría ser positivo (suma) o negativo (resta)
            System.out.println("El volante del vehículo " + this.brand + " se encuentra girado " + this.actualAngle + " grados.");
        } else if (isValidSumRight == false) {
            System.out.println("El volante del vehículo " + this.brand + " ya ha alcanzado el máximo de giro hacia la derecha.");
        } else if (isValidSumLeft == false) {
            System.out.println("El volante del vehículo " + this.brand + " ya ha alcanzado el máximo de giro hacia la izquierda.");
        }
    }

}//fin de clase

