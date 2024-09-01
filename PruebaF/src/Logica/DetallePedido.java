/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class DetallePedido {
    int id;
    int idPedido;
    int idProducto;
    int cantidad;
    double preUnitario;
    
    public DetallePedido() {
    }

    public DetallePedido(int id, int idPedido, int idProducto, int cantidad, double preUnitario) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.preUnitario = preUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreUnitario() {
        return preUnitario;
    }

    public void setPreUnitario(double preUnitario) {
        this.preUnitario = preUnitario;
    }
    
    
}
