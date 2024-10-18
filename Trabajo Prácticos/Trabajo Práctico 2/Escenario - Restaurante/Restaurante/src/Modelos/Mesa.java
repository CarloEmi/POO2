package Modelos;

public class Mesa {

    private int idMesa;
    private int capacidad;
    private boolean ocupada;

    // Constructor, getters y setters
    public Mesa(int idMesa, int capacidad, boolean ocupada) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
