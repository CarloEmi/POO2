public class SemaforoVerde implements Estado{
    /**
     * Cambia el estado del semaforo a verde.
     */
    @Override
    public void cambiar(){
        System.out.println("El semaforo cambio de color a VERDE");
    }   
}
