package main.java.clases_objetos;

public class CatEncapsulated {
    //Atributos
    private String name;
    private String breed;
    private String sex;
    private int age;
    private int hair;
    private String colour;
    private boolean castrated;
    //private String eyeColour = "green";
    public static final String EYE_COLOUR = "green";

    //Constructor
    public CatEncapsulated(String name, String breed, String sex, int age, int hair, String colour, boolean  castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    //Getters y setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("No se puede introducir una edad negativa");
        }
    }

    public int getHair() {
        return this.hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) { this.colour = colour; }

    public boolean isCastrated() {
        return this.castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return EYE_COLOUR;
    }

//    public void setEyeColour(String eyeColour) {
//        this.eyeColour = eyeColour;
//    }


    public void catDetails() {
        System.out.println("Cat{" +
                "name='" + this.getName() + '\'' +
                ", breed='" + this.getBreed() + '\'' +
                ", sex='" + this.getSex() + '\'' +
                ", age='" + this.getAge() + '\'' +
                ", hair='" + this.getHair() + '\'' +
                ", colour='" + this.getColour()+ '\'' +
                ", castrated=" + this.isCastrated() +
                ", eyeColour='" + CatEncapsulated.EYE_COLOUR+ '\'' +
                '}' + "\n\n");
        System.out.println("Color de todos los gatos: " + CatEncapsulated.EYE_COLOUR + "\n\n");
    }
//    public void catDetails() {
//        if (this.sex.equals("gato")) {
//            System.out.println("Se trata de un gato " + this.getBreed() + " llamado " + this.getName() + " de " + this.getAge() +
//                    " meses. Tiene el pelo de color " + this.getColour() + " de " +
//                    this.getHair() + "cm y los ojos de color " + this.getEyeColour() + ". Está castrato: " + this.isCastrated());
//        } else {
//            System.out.println("Se trata de una gata " + this.getBreed() + " llamada " + this.getName() + " de " + this.getAge() +
//                    " meses. Tiene el pelo de color " + this.getColour() + " de " +
//                    this.getHair() + "cm y los ojos de color " + this.getEyeColour() + ". Está castrada: " + this.isCastrated());
//        }
//    }

    public static void main(String[] args) {
        CatEncapsulated michiSiames = new CatEncapsulated("Feliciano", "siames", "gato", 15, 1, "marrón", false);
        michiSiames.catDetails();
        CatEncapsulated michiPersa = new CatEncapsulated("Chindasvinto", "persa", "gato", 32, 2, "blanco", false);
        michiPersa.catDetails();
        CatEncapsulated michiEsfinge = new CatEncapsulated("Hermenegilda", "esfinge", "gata", 7, 0, "castaño", false);
        michiEsfinge.catDetails();
        michiSiames.setCastrated(true);
        michiPersa.setCastrated(true);
        michiSiames.setColour("negro");
        michiPersa.setColour("beige");
        //michiEsfinge.setEyeColour("azul");
        michiEsfinge.setAge(-2);
        michiSiames.catDetails();
        michiPersa.catDetails();
        michiEsfinge.catDetails();
    }
}


