package com.campusdual.classroom;

public class Plane implements  IMachine{

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	@Override
	public void start(){
		System.out.println("El avión está encendido");
	}

	@Override
	public void stop(){
		System.out.println("El avión está parado");
	}

	@Override
	public void maintenance(){
		System.out.println("El avión está en mantenimiento");
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}

	public String getName() {
		return name;
	}
}
