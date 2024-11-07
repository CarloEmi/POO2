public class SemaforoRojo implements Estado{
    /**
     * Cambia el color del semaforo a rojo.
     * imprime el mensaje "El semaforo cambio de color a ROJO".
     */
    @Override
    public void cambiar(){
        System.out.println("El semaforo cambio de color a ROJO");
    }   
}

