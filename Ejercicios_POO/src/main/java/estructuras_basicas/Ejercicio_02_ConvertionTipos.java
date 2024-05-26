package main.java.estructuras_basicas;

public class Ejercicio_02_ConvertionTipos {

    public static void main(String[] args){
        String conversion = "200"; //esto es un string
        System.out.println("Variable de tipo String" + conversion);

        Integer conversionEntero = Integer.parseInt(conversion);// esto es un integer

        String conversionDeNuevoAString = Integer.toString(conversionEntero);// esto es un string

        char variableChar = conversionDeNuevoAString.charAt(0);//convierte a char el primer caracter de "200" --> 2
        System.out.println("Variable de tipo char " + variableChar);

        String otraVezDeNuevoAString = String.valueOf(variableChar); // convierte el char de antes '2' a string --> "2"
        System.out.println("Variable de tipo String " + otraVezDeNuevoAString);

        Double conversionNuevoADouble = Double.parseDouble(otraVezDeNuevoAString); //convierte el String "2" en Double 2.0
        System.out.println("Variable de tipo Double " + conversionNuevoADouble);
    }
}


