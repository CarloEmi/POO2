# Universidad Nacional de Misiones, FCEQyN

### Licenciatura en Sistemas de Información

### Programación Orientada a Objetos II

### Trabajo Práctico 3: Ejercicio n° 1

## Estudiantes: 
- Pereyra, Carlos Emiliano.
- Henker, Franco.
- Da Silva, Marcos.

**Año 2024**
### Descripción de Componentes
- Estado: Es una interfaz que define el método cambiar(). Todas las clases de estado (SemaforoRojo, SemaforoAmarillo, SemaforoVerde) implementan esta interfaz.

- SemaforoRojo, SemaforoAmarillo, SemaforoVerde: Son clases que implementan la interfaz Estado. Cada una tiene su propia implementación del método cambiar(), que imprime un mensaje indicando el color del semáforo.

- Semaforo: Esta clase tiene un atributo privado estado de tipo Estado. Tiene un constructor que inicializa el estado a SemaforoRojo, así como los métodos cambiar() y setEstado(Estado) para cambiar el estado del semáforo.

- Main: Esta clase contiene el método main, que es el punto de entrada del programa. Aquí se crea una instancia de Semaforo y se cambian sus estados.

 En este caso, las clases SemaforoRojo, SemaforoAmarillo y SemaforoVerde tienen una relación de implementación con la interfaz Estado.
Las clases y métodos están representados en un formato que muestra su visibilidad: + indica que el método es público, mientras que - indica que es privado

### Relaciones en el Diagrama de Clases
- Herencia: Se utiliza para mostrar que una clase hereda de otra. En este caso, las clases SemaforoRojo, SemaforoAmarillo, y SemaforoVerde implementan la interfaz Estado.

- Composición: Se utiliza para mostrar que una clase contiene a otra clase como parte de su estado. En este caso, la clase Main se compone de Semaforo y Semaforo tiene un atributo estado que es de tipo Estado. Esto se puede representar como una relación de composición.