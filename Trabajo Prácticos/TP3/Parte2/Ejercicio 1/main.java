public class Main{
/*************  ✨ Codeium Command ⭐  *************/
    /**
     * Programa principal del ejercicio 1 de la parte 2 del Trabajo Pr ctico 3.
     *
     * Crea un objeto Semaforo y lo hace cambiar de color dos veces.
     *
     * @param args No se utiliza.
     */
/******  dc1650d3-ea0c-438a-bf3d-9230f9af298b  *******/
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiar();
        semaforo.setEstado(new semaforoAmarillo());
        semaforo.cambiar();
        semaforo.setEstado(new semaforoVerde());
        semaforo.cambiar();
    }
}