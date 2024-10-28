public class Semaforo implements Estado{
    private Estado estado;

    public Semaforo(){
        this.estado = new SemaforoRojo();
    } 

    /**
     * Hace que el semaforo cambie de color.
     */
    public void cambiar(){
        this.estado.cambiar();
    }

    /**
     * Cambia el estado del semaforo.
     * @param estado el nuevo estado del semaforo.
     */
    public void setEstado(Estado estado){
        this.estado = estado;   
    }
}