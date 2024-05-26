# Ejercicio 23 - Colecciones: Mapas
## Descripción del ejercicio
Se creará una colección de tipo mapa y se poblará de elementos.
A continuación se añadirá mediante un método un nuevo elemento a la colección.
Por último se recorrerá cada entrada del mapa una a una, y para cada una de ellas se mostrarán por pantalla los detalles del valor.

### Objetivos
* Crear una colección de tipo *Map* e inicializarlo como *HashMap* en el método ``createHashMap()``. Luego poblar el mapa con diferentes 
  entradas y devolver el mapa creado.
* Añadir una entrada más al mapa en el método ``addMapValue()`` y devolver el objeto que se añadió como *value* de la *entry*.
* Crear un método ``printMapValues()`` que reciba un mapa y recorra cada entrada del mismo, imprimiendo los detalles de cada *value*.

### Elementos del mapa
Cada entrada del mapa será un par clave-valor (*key-value*). 
Las claves serán de tipo *String* y representarán el tipo del objeto que se añadirá como valor.
Los valores serán objetos de tipo *Person*, incluyendo sus especificaciones *Teacher*, *Police* o *Doctor*, instanciados a través de sus 
respectivos constructores.
* Primera entrada → clave: person; valor: objeto *Person* → John Smith
* Segunda entrada → clave: teacher; valor: objeto *Teacher* → María Montessori, Educación
* Tercera entrada → clave: police; valor: objeto *Police* → Jake Peralta, B-99
* Cuarta entrada → clave: doctor; valor: objeto *Doctor* → Gregory House, Nefrología e infectología

La nueva entrada del mapa será → clave: police; valor: objeto *Police* → Charles Boyle, B-99

### Clase Person
La clase *Person* es la clase "padre" que representa de forma genéria a una persona. Incluye el método ``getDetails()`` que muestra por 
pantalla el valor de sus propiedades. Este método lo heredarán las clases que extiendan de ella, y será el que se utilice en 
``printMapValues()``.

### Clases Teacher, Police y Doctor
Estas clases heredan de la clase *Person*. Son especificaciones de la misma e incorporan nuevas propiedades respectivamente.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```