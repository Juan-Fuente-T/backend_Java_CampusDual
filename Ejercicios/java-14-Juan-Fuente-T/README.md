# Ejercicio 14 - Herencia
## Descripción del ejercicio
Se debe completar una clase padre proporcionada para que sus métodos sean heredados y sobreescritos por sus clases hijas.

### Objetivos
* Dada la clase ``Person``, crear un método en ella llamado ``getDetails()`` que muestre por pantalla información de la persona 
  instanciada en cada objeto.
* Las clases proporcionadas ``Doctor``, ``PoliceOfficer`` y ``Teacher`` son especializaciones de la clase ``Person`` y *extienden* de 
  ella; por tanto, las instancias de estas clases heredarán el método ``getDetails()``. Cada clase hija deberá sobreescribir el método 
  heredado y completarlo para que también muestre información de cada nueva propiedad que incluye.
* En el método ``main()`` de la clase ``Exercise14`` ya se instancian objetos de las clases hijas. Es necesario usar el método 
  ``getDetails()`` de cada uno de ellos y comprobar que muestran por pantalla los datos correctamente.

### Métodos a implementar
El método ``getDetails()`` no devolverá nada. Simplemente imprimirá por pantalla los valores de las propiedades
``name`` y ``surname`` (*y un poco más de texto previo que indique el dato que se va a mostrar*). Luego, para las clases hijas mostrará 
además cada propiedad específica de cada clase hija.

Para construir el *String* con toda la información que se vaya a mostrar por pantalla se puede usar una composición básica *"texto" + 
elemento + "texto" ...* o bien se puede investigar el uso de la clase [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) 
y su método ``append()``.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
