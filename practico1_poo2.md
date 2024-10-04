# Universidad Nacional de Misiones, FCEQyN

### Licenciatura en Sistemas de Información

### Programación Orientada a Objetos II

### Trabajo Práctico 1: Práctica de UML

## Profesores: 
- Lic. Biale, Claudio.
- Asc. Kovalski, Matías.

## Estudiante: 
- Pereyra, Carlos Emiliano.

**Año 2024**

### Enlace al trabajo:

* [Clic para acceder al enlace del Trabajo Práctico 1](https://docs.google.com/document/d/10ozBrefH8_Rt6cqixDoiWSv9Bz174cFdEHMUvW1YfaQ/edit?usp=sharing)
* [Clic para acceder al enlace de las consignas del Trabajo Práctico 1](https://www.fceqyn.unam.edu.ar/moodle/pluginfile.php/285666/mod_resource/content/1/Trabajo%20Pr%C3%A1ctico%201.pdf)

* [Clic para acceder al enlace del Trabajo Práctico 1](https://docs.google.com/document/d/1MW1gcOkXaI3B0EO9dM546VB1x_oRHGgo2kqfCH-gkcs/edit)

Aclaraciones:
1. Biblioteca: 
- **Organización** en el diagrama se contempla como la institución a la que pertenezca la biblioteca
- **Usuario** Se diferencia entre el usuario que administra u opera el sistema y presta los libros, del **Lector** quien es el que retira los libros.
- **Prestamo** va a ser la funcón a la que se llame cada vez que se realice la operación de prestamo a un *Lector*, que a su vez va a involucrar cada una de las tablas.
2. Restaurante:
- **Organización** en el diagrama se contempla como la empresa a la que pertenezca el restaurante.
- **Usuario** Se diferencia entre el usuario que administra u opera el sistema y presta los libros, del *Cliente* quien es el que hace el pedido en la mesa.
- **Mesa** va a ser la que relacione el pedido del *Cliente* con *Pedido* y sea cargado por parte del *Usuario*.
- **Pedido** va a ser quien se relacione al *Plato* para poder asignarlos a la mesa que contiene al *Cliente*, que luego es cargado por el *Usuario* operador
3. Avion:
- **Organización** en el diagrama se contempla como la empresa de aerolinea a la que pertenezca el *Avión*.
- **Avion** esta relacionado con el *Vuelo* que a su vez esta relacionado con la *Reserva* que hace el *Cliente*
- **Reserva** es donde el *Usuario* puede acceder al *Asiento* que elija y la *Categoria* que puede ser clase turista o primera clase.
- **Vuelo** va a estar relacionado al *Aeropuerto* al que se asigne el vuelo, por medio de la *Reserva* que se relacione al *Cliente* que la realice.