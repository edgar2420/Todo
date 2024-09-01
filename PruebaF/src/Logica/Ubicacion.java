/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Ubicacion {
    private int ubicacion_id;
    private String calle;
    private int nro_Casa;
    private int id_cliente;
    private final String[] columnas = {"ID","CALLE", "NRO. CASA"};

    public Ubicacion() {
    }
    
    public Ubicacion(int ubicacion_id, String calle, int nro_Casa, int id_cliente) {
        this.ubicacion_id = ubicacion_id;
        this.calle = calle;
        this.nro_Casa = nro_Casa;
        this.id_cliente = id_cliente;
    }
    
    public DefaultTableModel mostrarUbicacion(int cliente_id) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        try {
            Connection con = new Conexion().conectarPG();
            PreparedStatement ps = con.prepareStatement("select ubicacion_id, calle, nro_casa from ubicacion where id_cliente = ?");
            ps.setInt(1, cliente_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ubicacion ubi = new Ubicacion();
                ubi.setUbicacion_id(rs.getInt(1));
                ubi.setCalle(rs.getString(2));
                ubi.setNro_Casa(rs.getInt(3));
                String[] datos = {String.valueOf(ubi.getUbicacion_id()), ubi.getCalle(), String.valueOf(ubi.getNro_Casa())};
                modelo.addRow(datos);
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    public int getUbicacion_id() {
        return ubicacion_id;
    }

    public void setUbicacion_id(int ubicacion_id) {
        this.ubicacion_id = ubicacion_id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro_Casa() {
        return nro_Casa;
    }

    public void setNro_Casa(int nro_Casa) {
        this.nro_Casa = nro_Casa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
