package main.java.clases_objetos;

public class CustomObjectEncapsulated {

    private int actualFuel = 10; //hemos cambiado de public a private
    private String fuelLabel = "Gasolina"; //hemos cambiado de public a private. Quitamos static

    //a partir de aquí todos los métodos deben ser no estáticos (getters y setters)
    //uso del this
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

    public String getFuelLabel() {
        return this.fuelLabel;
    }

    public void setFuelLabel(String fuelLabel) {
        this.fuelLabel = fuelLabel;
    }

    public void showDetails() {
        System.out.println("O tipo de combustible é: " + this.getFuelLabel());
    }


    //creamos el main() y con la encapsulación, accedemos de forma no estática
    //primero creamos el objeto y luego accedemos a los métodos
    public static void main(String[] args) {
        CustomObjectEncapsulated cO = new CustomObjectEncapsulated();
        cO.showDetails();

        cO.setFuelLabel("Diésel");
        cO.showDetails();

        System.out.println("O tipo de combustible da clase é: " + cO.getFuelLabel());
    }
}
