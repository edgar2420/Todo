package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Producto {
    int id;
    String n_restaurante;
    double precio;
    String nombre;
    String tipo;
    
    public Producto() {
    }

    public Producto(int id, String n_restaurante, double precio, String nombre, String tipo) {
        this.id = id;
        this.n_restaurante = n_restaurante;
        this.precio = precio;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN_restaurante() {
        return n_restaurante;
    }

    public void setN_restaurante(String n_restaurante) {
        this.n_restaurante = n_restaurante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    

}
