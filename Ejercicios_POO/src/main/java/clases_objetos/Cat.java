package main.java.clases_objetos;

public class Cat {
    /*
   Crea una clase llamada Cat
   La clase debe tener las siguientes propiedades sin inicializar:
   - nombre (name)
   - raza (breed)
   - sexo (sex)
   - edad en meses (age) (estática)
   - tamaño del pelo (hair)
   - color del pelo (colour) (estática)
   - un booleano que indique si está castrado/a o no (castrated)I

   La clase debe tener las siguientes propiedades con los valores inicializados
   - el color de los ojos (eyeColour): "green"

   Crea un constructor que incluya todos los atributos no inicializados

   Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

   Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

   Crea un método no estático que pueda castrar a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

   Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de
   los datos, dale un poco de arte)

   Crea un main()

   Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

   Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

   Cámbiale el color del pelo a los dos primeros gatos

   Cámbiale el color de los ojos al último gato

   Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

   Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

   Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático,
   getters y setters)
   Verás cómo afecta a los métodos estáticos
 */
    //Atributos
    public String name;
    public String breed;
    public String sex;
    public static int age;
    //public int hair;
    public String hair;
    public static String colour;
    public boolean castrated;
    public String eyeColour = "green";

    //Constructor
    public Cat(String name, String breed, String sex, int age, String hair, String colour) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        this.castrated = false; //false por defecto
    }

    public static void setColour(String newColour) {
        Cat.colour = newColour;
    }

    public void setEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }

    public static void setAge(int newAge) {
        if(newAge > 0) {
            Cat.age = newAge;
        }else{
            System.out.println("No se puede introducir un valor negativo como edad del gato.");
        }
    }

    public int getAge() {
        return Cat.age;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public boolean isCastrated() {
        return this.castrated;
    }



    public void catDetails() {
        System.out.println( "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + Cat.age + '\'' +
                ", hair='" + hair + '\'' +
                ", colour=" + Cat.colour + '\'' +
                ", castrated=" + castrated +
                ", eyeColour='" + eyeColour + '\'' +
                '}');
    }

    //public void catDetails() {

//        if (this.sex.equals("gato")) {
//            System.out.println("Se trata de un gato " + this.breed + " llamado " + this.name + " de " + this.getAge() +
//                    " meses. Tiene el pelo de color " + this.colour + " de " +
//                    this.hair + "cm y los ojos de color " + this.eyeColour + ". Está castrato: " + this.isCastrated());
//        } else {
//            System.out.println("Se trata de una gata " + this.breed + " llamada " + this.name + " de " + this.getAge() +
//                    " meses. Tiene el pelo de color " + this.colour + " de " +
//                    this.hair + "cm y los ojos de color " + this.eyeColour + ". Está castrada: " + this.isCastrated());
//        }
    //}

    public static void main(String[] args) {
        Cat michiSiames = new Cat("Feliciano", "siames", "gato", 5,"corto", "marrón");
        michiSiames.catDetails();
        Cat michiPersa = new Cat("Chindasvinto", "persa", "gato", 22,"largo", "blanco");
        michiPersa.catDetails();
        Cat michiEsfinge = new Cat("Hermenegilda", "esfinge", "gata", 17,"no", "castaño");
        //la edad es todas las instancias es la ultima edad introducida
        michiEsfinge.catDetails();
        michiSiames.setCastrated(true);
        michiPersa.setCastrated(true);
        Cat.setColour("Negro");//no se puede cambiar solo el color a una instancia de Cat al ser static el atributo colour
        michiEsfinge.setEyeColour("azul");
        Cat.setAge(-2);//No se puede cambiar la edad solo a una instancia de Cat al ser un atributo static
        michiSiames.catDetails();
        michiPersa.catDetails();
        michiEsfinge.catDetails();
    }

}
