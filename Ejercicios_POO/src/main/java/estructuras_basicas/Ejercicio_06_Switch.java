package main.java.estructuras_basicas;

public class Ejercicio_06_Switch {
    public static void main(String[] args) {
        checkMonthWithSwitch("March");
        checkMonthWithIfElseIf("March");
    }

    public static void checkMonthWithSwitch(String month) {
        switch (month) {
            case "January":
                System.out.println("El mes elegido es Enero");
                break;
            case "February":
                System.out.println("El mes elegido es Febrero");
                break;
            case "March":
                System.out.println("El mes elegido es Marzo");
                break;
            default:
                System.out.println("No has indicado el mes adecuado");
        }//switch
    }//checkMonthWithSwitch()


    public static void checkMonthWithIfElseIf(String month) {
        if (month.equals("January")) {
            System.out.println("El mes elegido es Enero");
        } else if (month.equals("February")) {
            System.out.println("El mes elegido es Febrero");
        } else if (month.equals("March")) {
            System.out.println("El mes elegido es Marzo");
        } else {
            System.out.println("No has indicado el mes adecuado");
        }
    }//checkMonthWithIfElseIf()

    //Usando sentencia switch (mas actual), usando una "expresión lambda" o "lambda switch"
    /*int mes = 4;
    String estacion = switch (mes) {
        case 12, 1, 2 -> "Invierno";
        case 3, 4, 5 -> "Primavera";
        case 6, 7, 8 -> "Verano";
        case 9, 10, 11 -> "Otoño";
        default -> "Mes no válido";
    };

    System.out.println("La estación del año es: "+estacion);

    //////////////////////////////////////////

    int dia = 5;
    String diaDeLaSemana = switch (dia) {
        case 1 -> "Lunes";
        case 2 -> "Martes";
        case 3 -> "Miércoles";
        case 4 -> "Jueves";
        case 5 -> "Viernes";
        case 6 -> "Sábado";
        case 7 -> "Domingo";
        default -> "Número inválido";
    };

    System.out.println("El día de la semana es: "+diaDeLaSemana);

    ///////////////////////////////////////////

    enum DiaDeLaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    DiaDeLaSemana dia = DiaDeLaSemana.MARTES;

    switch(dia)

        {
            case LUNES -> System.out.println("Inicio de semana");
            case MARTES, MIERCOLES, JUEVES -> System.out.println("Días de trabajo");
            case VIERNES -> System.out.println("Casi fin de semana");
            case SABADO, DOMINGO -> System.out.println("Fin de semana");
        }*/
}
