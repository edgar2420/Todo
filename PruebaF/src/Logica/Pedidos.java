/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;


public class Pedidos {
    int numero;
    int idCliente;
    int ci_idRepartidor;
    String fecha;
    double total;
    
    public Pedidos() {
    }

    public Pedidos(int numero, int idCliente, int ci_idRepartidor, String fecha, double total) {
        this.numero = numero;
        this.idCliente = idCliente;
        this.ci_idRepartidor = ci_idRepartidor;
        this.fecha = fecha;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCi_idRepartidor() {
        return ci_idRepartidor;
    }

    public void setCi_idRepartidor(int ci_idRepartidor) {
        this.ci_idRepartidor = ci_idRepartidor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
