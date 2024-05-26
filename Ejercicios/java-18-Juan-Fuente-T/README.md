# Ejercicio 18 - Arrays
## Descripción del ejercicio
Se desea crear e inicializar un array que contenga N números naturales. A continuación se mostrarán por pantalla los distintos elementos 
que conforman el array creado.

### Objetivos
* Crear un método llamado ``createAndInitializeArray()`` que reciba por parámetro un número entero y devuelva un array de tipo *int*. En 
  el cuerpo de este método se creará el array y se inicializará con tantos elementos como indique el parámetro (*usar un for*).
* Crear un método llamado ``showInlineArray()`` que reciba por parámetro un array de tipo entero y dentro del cuerpo lo recorra elemento 
  a elemento y los muestre por pantalla. El formato de presentación debe ser "secuencial", así: `numero1 numero2 numero3 ... numeroN`
* Cada método debe ser invocado desde un ``main()`` para la comprobación de su correcta funcionalidad.
* Hacer uso de la clase ``Utils`` proporcionada en el paquete ``util``. Usar los métodos correspondientes proporcionados (no usar un método 
  que solicita un *String* cuando se necesita pedir un *int*) en esta clase para requerir datos de entrada al usuario.

### Elementos del array
El array generado será de tipo *int*.  
Los elementos del array sólo pueden ser números naturales.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```