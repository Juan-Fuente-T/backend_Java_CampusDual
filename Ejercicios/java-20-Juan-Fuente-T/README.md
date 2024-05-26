# Ejercicio 20 - Colecciones
## Descripción del ejercicio
Se creará una colección de tipo lista y se poblará de elementos.
A continuación se recorrerá cada elemento de la lista, y para cada uno de ellos se accederá al método que muestra los detalles por pantalla.

### Objetivos
* Crear una colección de tipo *List* e inicializarla como *ArrayList* en el método ``getPeopleList()``. Luego poblar la lista con diferentes
  elementos de tipo *Person* y sus clases hijas y devolver la lista creada.
* Usar el método ``showPeopleDetails()`` para recorrer cada elemento de la lista y acceder al método que muestra por pantalla los detalles de 
  cada uno.

### Elementos de la colección
Cada elemento de la lista será un objeto de tipo *Person*, incluyendo sus especificaciones *Teacher*, *Police* o *Doctor*, instanciados a 
través de sus respectivos constructores.
* Primer elemento → objeto *Person* → John Smith
* Segundo elemento → objeto *Teacher* → María Montessori, Educación
* Tercer elemento → objeto *Police* → Jake Peralta, B-99
* Cuarto elemento → objeto *Doctor* → Gregory House, Nefrología e infectología

### Clase Person
La clase *Person* es la clase "padre" que representa de forma genérica a una persona. Incluye el método ``getDetails()`` que muestra por
pantalla el valor de sus propiedades. Este método lo heredarán las clases que extiendan de ella, y será el que se utilice en
``showPeopleDetails()``.

### Clases Teacher, Police y Doctor
Estas clases heredan de la clase *Person*. Son especificaciones de la misma e incorporan nuevas propiedades respectivamente.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```