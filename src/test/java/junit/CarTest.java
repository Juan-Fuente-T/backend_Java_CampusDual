package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car cocheSeat;

    @BeforeEach
    void Init(){
        this.cocheSeat = new Car("Seat", "León", "Diesel");
    }
    @Test
    void testStartTachometerZeroAndCarOff(){
        Assertions.assertFalse(this.cocheSeat.carOn);
        Assertions.assertFalse(this.cocheSeat.isTachometerGreaterThanZero());
        this.cocheSeat.start();
        Assertions.assertTrue(this.cocheSeat.carOn);
        Assertions.assertTrue(this.cocheSeat.isTachometerGreaterThanZero());
        Assertions.assertEquals(1000, this.cocheSeat.tachometer);
    }
    @Test
    void testStartMotorTachometerGreatherThanZeroAndCarOff(){
        this.cocheSeat.tachometer = 1500;
        this.cocheSeat.start();
        Assertions.assertFalse(this.cocheSeat.carOn);
        Assertions.assertTrue(this.cocheSeat.isTachometerGreaterThanZero());
        Assertions.assertEquals(1500, this.cocheSeat.tachometer);
    }
    @Test
    void testStartMotorTachometerZeroAndCarOn(){
        this.cocheSeat.carOn = true;
        this.cocheSeat.start();
        Assertions.assertTrue(this.cocheSeat.carOn);
        Assertions.assertFalse(this.cocheSeat.isTachometerGreaterThanZero());
        Assertions.assertEquals(0, this.cocheSeat.tachometer);
    }

    @Test
    void testStopSpeedometerZero(){
        this.cocheSeat.start();
        Assertions.assertTrue(this.cocheSeat.carOn);
        Assertions.assertEquals(1000, this.cocheSeat.tachometer);
        this.cocheSeat.stop();
        Assertions.assertFalse(this.cocheSeat.carOn);
        Assertions.assertEquals(0, this.cocheSeat.tachometer);
        Assertions.assertEquals(0, this.cocheSeat.speedometer);
    }

}
/*
*     public void start() {
        if (!this.isTachometerGreaterThanZero() && !this.carOn) {
            this.carOn = true;
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }
* */