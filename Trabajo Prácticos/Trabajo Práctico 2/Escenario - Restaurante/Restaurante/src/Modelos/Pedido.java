package Modelos;

import java.sql.Date;
import java.util.List;

public class Pedido {

    private int idPedido;
    private boolean estado;
    private Date fecha;
    private Cliente cliente;  // Relación con Cliente
    private Mesa mesa;        // Relación con Mesa
    private List<Plato> platos; // Composición con platos

    // Constructor, getters y setters
    public Pedido(int idPedido, boolean estado, Date fecha, Cliente cliente, Mesa mesa, List<Plato> platos) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
        this.platos = platos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }
}
