package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		plane.start();
		tractor.start();

		plane.takeOff();
		plane.fly();
		tractor.forward();
		tractor.stop();
		plane.land();
		tractor.backward();
		plane.maintenance();
		tractor.maintenance();

		System.out.println("Caballos del tractor: " + tractor.getHorsePower());
		System.out.println("El nombre del avión es " + plane.getName());
	}
}
