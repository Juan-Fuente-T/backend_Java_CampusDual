# Ejercicio 04 - Estructuras de Control
## Descripción del ejercicio
Se realizará una primera toma de contacto con las estructuras de control del flujo de avance del código.

### Objetivos
* Dada la clase ``Exercise04`` proporcionada, completar los métodos proporcionados ``sumNum()``, ``sumEvenNum()``, ``factorial()`` y 
  ``recursiveFactorial()`` para realizar cálculos matemáticos mediante el uso de estructuras de control del flujo del código.

### Métodos a implementar
* En el método ``main()`` se mostrarán ejemplos de cálculos matemáticos sin el uso de estructuras de control. Desde este método se 
  invocará a cada uno de los métodos restantes para hacer los mismos cálculos, pero utilizando estructuras de control. Es necesario 
  comprobar que se obtienen los mismos resultados de ambas formas.
* El método ``sumNum()`` recibe un número entero por parámetro. El método calculará la suma de los primeros números enteros que se 
  solicite en el parámetro.
* El método ``sumEvenNum()`` recibe un número entero por parámetro. El método calculará la suma de los primeros números enteros pares que se
  solicite en el parámetro.
* El método ``factorial()`` recibe un número entero por parámetro. El método calculará el factorial del número que se solicite en el 
  parámetro.
* El método ``recursiveFactorial()`` recibe un número entero por parámetro. El método hará la misma operación que el método ``factorial()
  `` pero sirviéndose de la recursividad, es decir, invocándose a sí mismo (buscar información sobre recursividad).

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
