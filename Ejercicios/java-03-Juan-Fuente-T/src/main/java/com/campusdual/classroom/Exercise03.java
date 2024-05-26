/*package com.campusdual.classroom;

import java.util.Objects;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    public static String greetings(String name) {
        return "Hola. Bienvenido ".concat(name);
    }

    // Esto es una funcion, ya que devuelve un valor
    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es ".concat(nombre);
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    public static void checkUser(String user, String pass) {
        if("Sebas".equals(user) && "sebas01".equals(pass)){
            System.out.println(greetings(user));
        }else{
            System.out.println(error("Sebas"));
        }

    }
    public static void main(String[] args) {
        checkUser("Sebas", "sebas01");
        checkUser("Pedrito", "cavernicola");
    }
} */

//VARIANTE CLASE
package com.campusdual.classroom;

import java.util.Objects;

    public class Exercise03 {

        // Esto es una funcion, ya que devuelve un valor
        public static String greetings(String name) {
            String mensajeBienvenida = "Hola. Bienvenido " + name;
            return mensajeBienvenida;
        }

        // Esto es una funcion, ya que devuelve un valor
        public static String error(String nombre) {
            String mensajeError = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
            return mensajeError;
        }

        //Esto es un procedimiento, ya que no devuelve un valor
        public static void checkUser(String user, String pass) {
            if(Objects.equals("Sebas",user) && Objects.equals("sebas01",pass)){
                System.out.println(greetings(user));
            }else{
                System.out.println(error("Sebas"));
            }

        }
        public static void main(String[] args) {
            checkUser("Sebas", "sebas01");
            checkUser("Pedrito", "cebolla");
        }
    }

