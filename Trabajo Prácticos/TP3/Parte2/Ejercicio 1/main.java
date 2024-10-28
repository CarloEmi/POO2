public class Main{
    /**
     * Programa principal del ejercicio 1 de la parte 2 del Trabajo Pr ctico 3.
     *
     * Crea un objeto Semaforo y lo hace cambiar de color dos veces.
     *
     * @param args No se utiliza.
     */
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiar();//Rojo
        semaforo.setEstado(new SemaforoAmarillo());
        semaforo.cambiar();//Amarillo
        semaforo.setEstado(new SemaforoVerde());
        semaforo.cambiar();//Verde
    }
}