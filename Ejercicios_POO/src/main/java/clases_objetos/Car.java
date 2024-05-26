package main.java.clases_objetos;

public class Car {
    //atributos
    public static final int MAX_SPEED = 120;
    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int steeringWheelAngle = 0;

    //constructor
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    //metodos
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo acendido");
        } else {
            System.out.println("O vehiculo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }

    //falta check de si esta encendido??
    public void accelerate() {
        if (this.speedometer == this.MAX_SPEED) {
            System.out.println("Velocidade máxima alcanzada");
        } else {
            if (this.isReverse() && (this.speedometer == 25)) {
                System.out.println("O vehículo non pode ir a máis velocidade marcha atrás.");
            } else {
                this.speedometer += 5;
                if (!this.isReverse()) {
                    this.calculateTachometer();
                }
            }
        }
    }

    public void brake() {
        if (this.speedometer == 0) {
            System.out.println("O vehículo está detido");
        } else {
            this.speedometer -= 5;
            if ((this.speedometer != 0) && !this.isReverse()) {
                this.calculateTachometer();
            } else {
                if (!this.isReverse()) {
                    this.tachometer = 1000;
                    this.gear = "N";
                }
            }
        }
    }

    public void turnSteeringWheel(int angle) {
        if (((this.steeringWheelAngle + angle) <= 45) && ((this.steeringWheelAngle + angle) >= -45)) {
            this.steeringWheelAngle += angle;
        } else {
            this.steeringWheelAngle = angle > 0 ? Math.min(45, this.steeringWheelAngle + angle)
                    : Math.max(-45, this.steeringWheelAngle + angle);
            System.out.println("As rodas non poden xirar máis");
        }
    }

    public String showSteeringWheelDetail() {
        StringBuilder builder = new StringBuilder();
        if (this.steeringWheelAngle == 0) {
            builder.append("Recto (");
            builder.append(this.steeringWheelAngle);
            builder.append("º)");
        } else if (this.steeringWheelAngle > 0) {
            builder.append("Derecha (");
            builder.append(this.steeringWheelAngle);
            builder.append("º)");
        } else {
            builder.append("Izquierda (");
            builder.append(Math.abs(this.steeringWheelAngle));
            builder.append("º)");
        }
        return builder.toString();
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            if (this.isReverse() == reverse) {
                System.out.println("O vehículo xa ten esa marcha");
            } else {
                this.reverse = reverse;
                if (reverse) {
                    this.gear = "R";
                    System.out.println("Marcha atrás engranada");
                } else {
                    this.gear = "N";
                    System.out.println("Marcha directa engranada");
                }
            }
        } else {
            System.out.println("O vehículo aínda non esta detido.");
        }
    }

    public void showDetails() {
        System.out.println("O " + this.brand + " " + this.model + " marca: Velocímetro: " + this.speedometer
                + " - Tacógrafo: " + this.tachometer + " - Marcha: " + this.gear
                + " - Volante: " + this.showSteeringWheelDetail());
    }

    private void calculateTachometer() {
        double gearVel = (float) this.speedometer / 25;
        double gearVelInt = Math.floor(gearVel);
        this.gear = Integer.toString((int) (gearVelInt) + 1);
        double fract = gearVel - gearVelInt;
        this.tachometer = (int) ((fract * 100 * 1500) / 100) + 1000;
    }
}
