package Modelos;

import java.util.List;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String apellido;
    private List<Pedido> pedidos;  // Relación con Pedido

    // Constructor, getters y setters
    public Cliente(int idCliente, String nombre, String apellido, List<Pedido> pedidos) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pedidos = pedidos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
