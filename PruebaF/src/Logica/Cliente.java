package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Rojas
 */
public class Cliente {

    public static int id;
    int Telefono;
    String Nombres;
    String Apellidos;
    String Contraseña;
    String Correo;
    String id_ubicacion;

    public Cliente() {

    }

    public Cliente(int id, int Telefono, String Nombres, String Apellidos, String Contraseña, String Correo, String id_ubicacion) {
        this.id = id;
        this.Telefono = Telefono;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
        this.id_ubicacion = id_ubicacion;
    }
        public void insertarCliente() {
        try {
            Connection con = new Conexion().conectarPG();
            PreparedStatement ps = con.prepareStatement("SELECT ins_cliente(?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, Nombres);
            ps.setString(3, Apellidos);
            ps.setInt(4, Telefono);
            ps.setString(5, Correo);
            ps.setString(6, Contraseña);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Registrado con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public void ObtenerId() throws SQLException{
            Connection con = new Conexion().conectarPG();
            PreparedStatement ps = con.prepareStatement("SELECT id FROM cliente where correo = 'jeison1@gmail.com';");
        }
        
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(String id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

}
