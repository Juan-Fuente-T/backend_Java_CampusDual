package main.java.clases_objetos;

public class CustomObject {


    public int actualFuel = 10;

    public static String fuelLabel = "Gasolina";

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("A capacidade non pode ser negativa.");
        }
    }

    public static String getFuelLabel() {
        return CustomObject.fuelLabel;
    }

    public static void setFuelLabel(String fuelLabel) {
        CustomObject.fuelLabel = fuelLabel;
    }

    public void showDetails() {
        System.out.println("O tipo de combustible é: " + CustomObject.getFuelLabel());
    }

    public static void main(String[] args) {
        CustomObject cO = new CustomObject(); //cremos una instancia de la clase CustomObject
        cO.showDetails(); //accedemos de forma no estática al método del objeto (de la instancia)

        CustomObject.setFuelLabel("Diésel"); //accedemos de forma estática al método de la clase
        cO.showDetails();

        System.out.println("O tipo de combustible da clase é: " + CustomObject.getFuelLabel());
    }
}
