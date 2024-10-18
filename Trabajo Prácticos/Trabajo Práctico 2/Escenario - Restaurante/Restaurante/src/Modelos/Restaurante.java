package Modelos;

import java.util.List;

public class Restaurante {

    private int idRestaurante;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Pedido> pedidos;  // Relación con Pedido

    // Constructor, getters y setters
    public Restaurante(int idRestaurante, String nombre, String direccion, String telefono, List<Pedido> pedidos) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pedidos = pedidos;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
