# Ejercicio 17 - Arrays
## Descripción del ejercicio
Se realizarán ejemplos de creación e inicialización de un array; de la asignación de un valor a un índice concreto de un array creado; de 
obtención de la extensión de un array, y de obtención del valor de un índice concreto de un array.

### Objetivos
* Completar el método ``createEmptyIntArray()`` que reciba por parámetro un número entero y devuelva un array de tipo *int*, solamente 
  creado, pero no inicializado (*sin valores asignados a cada posición*), con tantos elementos como indique el parámetro.
* Completar el método ``createInitializedStringArray()``  para crear y devolver un sencillo array de tipo *String* de unos pocos elementos.
* Completar el método ``populateArray()``, que recibe por parámetro un array de tipo entero, un índice y un valor, para asignar dicho valor 
  al índice especificado de dicho array.
* Completar el método ``arrayLength()``, que recibe por parámetro un array de tipo entero y devuelve su tamaño.
* Completar el método ``showValue()``, que recibe por parámetro un array de tipo entero y un índice, y devuelve el valor de ese índice 
  del array.

### Elementos del array
Todos los array generados serán de tipo *int*, a excepción del array generado en el método ``createInitializedStringArray()``, que será 
de tipo *String*, pero cada elemento será un número convertido a cadena.
El ``main()`` que se proporciona ya cubierto se encargará de ir invocando a cada método y funcionalidad. Revisar cuando muestre por consola 
que los resultados esperados son correctos. 

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```