# Ejercicio 21 - Colecciones: Conjuntos
## Descripción del ejercicio
Se crearán dos colecciones de conjuntos de tipo *HashSet* y *TreeSet* respectivamente, y se poblarán de elementos.
A continuación se añadirá mediante un método un nuevo elemento a cada conjunto.
Por último se recorrerán los elementos de cada conjunto y se mostrarán por pantalla.

### Objetivos
* Crear una colección de tipo *Set* e inicializarla como *HashSet* en el método ``createHashSet()``. Luego poblar el conjunto con 
  elementos y devolver el *HashSet* construído. Realizar el proceso análogo como *TreeSet* en el método ``createTreeSet()``.
* Añadir un elemento más a cada conjunto usando el método ``addElementToSet()`` y devolver el booleano resultante de la operación.
* Recorrer cada conjunto usando el método ``printSet()`` mostrando por pantalla el valor de cada elemento.

### Elementos de los conjuntos
Los elementos serán de tipo *String*. Para ambos conjuntos los elementos a añadir serán los mismos:
* ELEMENT KPRBC
* ELEMENT YPBTM
* ELEMENT AADXU
* ELEMENT RXCGJ
* ELEMENT WYMVD
* ELEMENT WFGEJ
* ELEMENT TYGBS
* ELEMENT MAPTK
* ELEMENT GJXVE
* ELEMENT BAFGL

El nuevo elemento a añadir después a cada uno de los conjuntos será ELEMENT AAA

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```