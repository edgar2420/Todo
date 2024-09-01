/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    
    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso = new Conexion();
    Producto pro = new Producto();
    
    public List listarProducto() {
        String sql = "select * from productos where n_restaurante = 'Pollo el Solar'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto2() {
        String sql = "select * from productos where n_restaurante = 'Pollos Chuy'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto3() {
        String sql = "select * from productos where n_restaurante = 'Pollos Campeon'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto4() {
        String sql = "select * from productos where n_restaurante = 'Pizza Río'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto5() {
        String sql = "select * from productos where n_restaurante = 'Texas Burger'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto6() {
        String sql = "select * from productos where n_restaurante = 'Hamburguesas Toby'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto7() {
        String sql = "select * from productos where n_restaurante = 'La Mala Pizzeria'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
    
    public List listarProducto8() {
        String sql = "select * from productos where n_restaurante = 'El Arriero'";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setN_restaurante(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setNombre(rs.getString(4));
                p.setTipo(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }
}
