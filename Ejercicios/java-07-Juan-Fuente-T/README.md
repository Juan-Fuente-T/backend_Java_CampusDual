# Ejercicio 07 - Estructuras de Control 4
## Descripción del ejercicio
Se realizarán más ejercicios relacionados con las estructuras de control

### Objetivos
* Dada la clase ``Exercise07`` proporcionada, completar los métodos proporcionados ``positionInAList()``, ``sumFirstNaturalNumbers()`` y 
  ``showFirstNaturalNumbers()`` siguiendo las instrucciones de los ``TODO`` comentados.

### Métodos a implementar
* Desde el método ``main()`` se llamará al resto de métodos, pasándoles a cada uno, respectivamente, los argumentos necesarios

* El método ``positionInAList()`` recibe un número entero por parámetro. El método tiene declarada e inicializada una lista con los 10
  primeros números y además el cero. Usando un for, se deberá recorrer la lista en toda su extensión (``size()``) y comprobar si el
  número recibido por parámetro se encuentra en dicha lista (obtener --> ``get()`` cada índice de la lista y compararlo con el número
  recibido por parámetro). En caso afirmativo o negativo se deberá mostrar por pantalla.
* El método ``sumFirstNaturalNumbers()`` recibe un número entero por parámetro. El método mostrará por pantalla un mensaje o mensajes, 
  para que quede más claro, que muestre la suma de los primeros números positivos que indique el parámetro.
* El método ``sumFirstNaturalNumbers()`` recibe un número entero por parámetro. El método mostrará por pantalla un mensaje o mensajes,
  para que quede más claro, que muestre los primeros números positivos que indique el parámetro.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
