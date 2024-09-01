/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements Interfaz {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public void Cliente() {
    }

    public boolean IniciarSesion(String correo, String contraseña) {
        boolean existe = false;
        Cliente ev = new Cliente();
        String sql = "select autenticar (?,?)";
        try {
            con = cn.conectarPG();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contraseña);
            System.out.println(ps.toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                if (rs.getString(1).equals("1")) {
                    existe = true;
                }
            }

        } catch (Exception e) {
           // e.printStackTrace();
        }
        return existe;
    }

    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = cn.conectarPG();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setTelefono(rs.getInt(4));
                c.setCorreo(rs.getString(5));
                c.setContraseña(rs.getString(6));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int add(Object[] o) {
        int co = 0;
        String sql = "select insert_cliente(?,?,?,?,?,?,'Cliente')";
        try {
            con = cn.conectarPG();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            co = ps.executeUpdate();
        } catch (Exception e) {
        }
        return co;
    }
    /*public void insertarPersona(Persona persona) {
        try {

            PreparedStatement ps = con.prepareStatement("SELECT insertar_actualizar_persona('" + persona.getCi_id() + "','" + persona.getCi_id() + "','"
                    + persona.getPnombre() + "','" + persona.getPapellido() + "','" + persona.getF_nacimiento() + "','" + persona.getTelefono() + "','"
                    + persona.getDireccoin() + "','" + persona.getCorreo() + "')");
            JOptionPane.showMessageDialog(null, " se guardo ");
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }*/

}
