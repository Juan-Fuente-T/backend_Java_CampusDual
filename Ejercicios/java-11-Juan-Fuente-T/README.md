# Ejercicio 11 - Clases y Objetos - TvRemote
## Descripción del ejercicio
Se implementará el contenido de una clase básica, con sus atributos y métodos, para luego ser instanciada desde otra clase.

### Objetivos
* Dada la clase ``Exercise11`` y ``TVRemote`` proporcionadas, desarrollar el contenido de la clase ``TVRremote`` para que el código 
  proporcionado en el método ``main()`` funcione correctamente.

### Clases y métodos a implementar
* La clase ``TVRemote`` proporcionada está vacía. Será necesario copiar todo lo que se muestra en la diapositiva número 29 del temario 
  de POO dentro de esta clase: sus atributos y métodos. De esta forma, al ejecutar el código proporcionado del ``main()`` de la clase 
  ``Exercise11`` no habrá ningún error.
* A mayores del código proporcionado en el ``main()``, también dentro de este método, será necesario: 
  * Encender la TV
  * Subir un canal
  * Bajar un canal
  * Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
  * Subir el volumen
  * Bajar el volumen
  * Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
  * Obtener el color del mando a distancia y mostrarlo por pantalla
  * Apagar la TV

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
