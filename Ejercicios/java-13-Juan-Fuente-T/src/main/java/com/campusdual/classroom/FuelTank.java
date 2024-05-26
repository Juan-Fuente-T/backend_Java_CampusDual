package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public void setActualFuel(int newActualFuel){
    if (newActualFuel < 0) {
      System.out.println("El nivel de combustible no puede ser negativo");
    }else{
      this.actualFuel = newActualFuel;
    }
  }
  public int getActualFuel() {
    return this.actualFuel;
  }
}
