package main.java.clases_objetos;

public class Ejercicio_08_TvRemote {
    public static void main(String[] args) {
        TvRemote redRemote = new TvRemote ("Rojo");
        TvRemote blackRemote = new TvRemote ("Negro");
        System.out.println("El color del mando redRemote es " + redRemote.getColor());
        System.out.println("El color del mando blackRemote es " + blackRemote.getColor());

        //encender la tele
        //subir el volumen
        //bajar un canal, ¿se puede? explica por que
        //subir el volumen
        //subir el volumen
        //crear un mensaje que muestre por pantalla cual es el volumen actual
        //crear un mensaje que muestre por pantalla cual es el canal actual
        //apagar la tele
        redRemote.turnOn();
        redRemote.volumeUp();
        redRemote.channelDown(); //no se puede, el channel esta en 0 y no se puede bajar mas
        redRemote.volumeUp();
        redRemote.volumeUp();
        System.out.println("El volumen actual es " + redRemote.volume);
        System.out.println("El canal actual es " + redRemote.channel);
        redRemote.turnOff();
    }
}
