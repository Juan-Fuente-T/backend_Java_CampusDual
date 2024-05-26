package com.campusdual.classroom;

public class TVRemote {
    //atributos
    int channel;//en que canal está
    int volume;//en que nivel de volumen está
    boolean on;//si la tv esta encendida o no
    String color;//color del mando a distancia
    //constructores
    //El constructor tendrá siempre el mismo nombre que la clase que a va a instanciaR
    //Usará la nomenclatura de las clases,con permiso para empezar con mayúscula
    //No llevan indicador de si devuelve algo o no (no lleva void, por ejemplo)
    //Dentro del constructor podremos inicializar a gusto las variables de la clase
    //El constructor se puede diseñar para que reciba o no parametros,
    //puede recibir tantos parametros como atributos tiene la clase
    public TVRemote(String color){
        this.channel = 0;
        this.volume = 20;
        this.color = color;
    }

    //metodos
    public boolean turnOn() {
        this.on = true;
        return this.on;
    }
    public boolean turnOff() {
        this.on = false;
        return this.on;
    }
    public void channelUp() {
        this.channel++;
    }
    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        }
    }
    public void volumeUp() {
        this.volume++;
    }
    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }
    }
    public String getColor() {
        return this.color;
    }
    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        }else{
            return true;
        }
    }
}

