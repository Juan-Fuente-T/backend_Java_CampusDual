package main.java.estructuras_basicas;

public class Ejercicio_03_Metodos {
    //FUNCIONES Y PROCEDIMIENTOS
    //Ejemplo de funcion: devuelve un String
    public static String ejemploString1() {//CABECERA DEL METODO
        String saludo = "Hola, que tal?";
        return saludo;
    }
    //Ejemplo2 de funcion: devuelve un int
    public static int ejemploInt(int valorInicial){
        int valorFinal = valorInicial + 45;
        return valorFinal;
    }
    //Ejemplo1 de procedimiento: no devuelve nada
    public static void ejemploInt2(int valor){
        int valorFinal = valor + 20;
        String stringFinal = String.valueOf(valorFinal);
        System.out.println(stringFinal);
    }
    //Ejemplo2 de procedimiento: no devuelve nada
    public static void ejemploString2(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {
        //llamadas a funciones
        String resultadoEjemplo1 = ejemploString1(); //llamamos al metodo ejemploString1();
        System.out.println(resultadoEjemplo1);
        System.out.println(ejemploString1());

        int resultadoEjemploInt = ejemploInt(458);
        //llamadas a procedimientos
        ejemploString2("hola que tal");
        ejemploInt2(12);
        calcularPorcentaje(5, 90);
    }
    /* Ejercicio) Crear un método que reciba por parámetro dos enteros: a y b, y calcule "el a por ciento
     * de b", y lo muestre por pantalla. Por ejemplo: a= 5, b= 90 --> Calcula el 5 por ciento de 90.*/
    public static void calcularPorcentaje(int a, int b){
        //multiplicar uno por el otro y dividir lo que de entre 100
        //    double productoDeLosNumeros = a * b;
        //    Double resultado = Double.parseDouble(String.valueOf(productoDeLosNumeros / 100));
        //    double resultado = (double) (a * b) / 100;
        //System.out.println("El " + a + "%" + " de " + b + " es: " + result);
        System.out.println((double) (a * b) / 100);
    }

}