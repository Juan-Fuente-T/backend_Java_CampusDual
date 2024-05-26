# Ejercicio 16 - Polimorfismo
## Descripción del ejercicio
Se deberá implementar una interfaz proporcionada en otras clases dadas. Cada clase implementará la interfaz y sus métodos correspondientes.

### Objetivos
* Implementar la interfaz ``IMachine`` en las clases ``Plane`` y ``Tractor``. Las firmas de los métodos ``start()``, ``stop()`` y 
  ``maintenance()`` se deberán desarrollar en cada clase.

### Métodos a implementar
En cada clase, el método ``start()`` mostrará un mensaje por pantalla de que el vehículo correspondiente está encendido. Para el método 
``stop()`` indicará que está apagado; y para el método ``maintenance()`` indicará que se encuentra realizando un mantenimiento.
En el método ``main()`` de la clase ``Exercise16`` ya se proporciona un ejemplo de instanciación de cada clase, y algún método de las 
mismas. Probar algún método más como ejemplo.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```