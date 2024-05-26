package main.java.scanner;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_20_Scanner {

    public static void main(String[] args) {

        //La clase Scanner sirve para analizar(escanear) lo que se introduce
        // a traves del teclado. El flujo de entrada de datos será System.in
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numerEscaneado = scan.nextInt(); //declaro un entero y almaceno lo que devuelva
        //el scan. Sacanner convertira lo que introduzca por teclado al tipo correspondiente
        //(a traves del metodo adecuado)

        scan.reset();//resetea el flujo para dejarlo limpio para futuros usos
        System.out.println("El numero es " + numerEscaneado);

        System.out.println("Ahora introduce un texto");
        String textoEscaneado = scan.next(); //no termina de ir bien, solo imprime la primera
        //palabra, parece ser un problema del reset entre los dos escaneos
        System.out.println("El string es " + textoEscaneado);

//        //ejemplo de error en la entrada de datos --> salta una excepcion que debemos controlar
//        System.out.println("Introduce otro numero: ");
//        try {
//            int numero2 = scan.nextInt();
//            System.out.println("El nuevo numero es: " + numero2);
//        } catch (InputMismatchException e) {
//            System.out.println("ERROR: lo que has introducido por consola no coindice con lo que se te ha pedido");
//            e.printStackTrace();
//        }

        scan.close();//como tratamos con flujos de datos acordarse de cerrar el flujo al final
    }
}
/*
//VERSION ALBERTO PROFE
public class Ejercicio_20_Scanner {

    public static void main(String[] args) {

        //La clase Scanner sirve para analizar (escanear) lo que se introduce
        //a traves del teclado. El flujo de entrada de datos sera System.in
        Scanner scan = new Scanner(System.in);

        System.out.println("Hola compi. Introduce un numero por teclado");

        int numeroEscaneado = scan.nextInt(); //declaro un entero y almaceno lo que devuelva el scan
        //Scanner convertira lo que introduzca por teclado al
        //tipo correspondiente (a traves del metodo adecuado)

        System.out.println("El numero que has introducido es: " + numeroEscaneado);

        //ejemplo de escaneo de un String, usando el metodo nextLine()
        System.out.println("Ahora introduce una cadena de texto");

        String textoEscaneado = scan.nextLine();
        System.out.println("El texto que has introducido en mayusculas: " + textoEscaneado);


//        //ejemplo de error en la entrada de datos --> salta una excepcion que debemos controlar
//        System.out.println("Introduce otro numero: ");
//        try {
//            int numero2 = scan.nextInt();
//            System.out.println("El nuevo numero es: " + numero2);
//        } catch (InputMismatchException e) {
//            System.out.println("ERROR: lo que has introducido por consola no coindice con lo que se te ha pedido");
//            e.printStackTrace();
//        }

        scan.close(); //como tratamos con flujos de datos, acordarse de cerrar el flujo al final

    }
}
 */