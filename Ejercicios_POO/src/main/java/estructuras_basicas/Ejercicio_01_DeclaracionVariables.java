package main.java.estructuras_basicas;
//Esto es un comentario de linea

/* Esto
 * es un
 * comentario
 * de parrafo */
public class Ejercicio_01_DeclaracionVariables {
    public static void main(String[] args) {
        //Uso de variables
        int prueba; //solo declaro una variable
        int valor = 5; //ademas de declararla la inicializo con un valor
        valor = 2 - valor; //ahora valor vale -3
        valor += 3;//lo mismo que valor = valor +3 (ahora vale 0)
        valor -= 1;// lo mismo que valor que valor = valor - 1 (ahora vale -1)
        valor *= 4;// lo mismo que valor que valor = valor * 4 (ahora vale -4)

        int nuevo = 3;
        int miValor = 2;
        valor = nuevo + miValor; //ahora vale 3 + 2 = 5

        final int CONST = 2; //necesario usar la palabra final
        valor = CONST; //ahora vale 2
        valor += 3;//ahora vale 5

        System.out.print("El valor de la variable es: " + valor);//imprime el texto y valor
        System.out.println("\nEl valor de la variable es: " + (valor + 100));//imprime el texto y valor, en lineas distintas
        //\ln hace que se imprima en una nueva linea, \t añade tabulacion, investigar \r y printf
        System.out.println("el valor de la variable es: " + (valor + 41));
        System.out.println("el valor de la variable es: " + valor);
        System.out.println("el valor de la variable es: " + (valor + 41));
        System.out.println("el valor de la variable es: " + valor);
        System.out.println("el valor de la variable es: " + (valor + 41));
        int variableEntero = 23; //declaración de variable de tipo entero

        int variable2; //declaración de variable, no inicializada

        long variableLong = 183; //declaración de variable de tipo long

        Long variableLong2 = 1234567890123456789L; //declaración de variable de tipo long

        Long variableLong3 = 9223372036854775807L;

        double variableDouble = 25.4; //declaración de variable de tipo double

        float variableFloat = 25.4f; //declaración de variable de tipo double

        String variableString = "Hola"; //declaración de variable de tipo String

        byte variableByte = 2; //declaración de variable de tipo byte

        final int CONSTANTE_ENTERA = 63; //declaración de constante de tipo int

        final String CONSTANTE_STRING = "Esto es un string"; //declaración de constante de tipo String

        System.out.println("Prueba con las\nopciones dentro de printLn /n");
        System.out.println("Prueba con las\ropciones dentro de printLn /r");
        System.out.println("Prueba con las\topciones dentro de printLn /t");
        System.out.println("Prueba con las \f opciones dentro de printLn /f");
        System.out.println("Prueba con las\bopciones dentro de printLn /b");
    }
    /*public static void main(String[] args) {
        System.out.println("Prueba con las\nopciones dentro de printLn");
    }*/


}// esta es la llave que cierra la clase






