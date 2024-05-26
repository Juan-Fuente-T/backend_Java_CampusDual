package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.setActualFuel(-8);
        ft.setActualFuel(35);
        ft.showDetails();
        ft.setActualFuel(0);
        ft.showDetails();
    }
}

