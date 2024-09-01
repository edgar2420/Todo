package Logica;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

        public static ResultSet rs;
        public static Statement st;
    
    public Connection conectarPG() {
        
        
        Connection con = null;

        String db = "jdbc:postgresql://localhost:5432/Fenix5";
        String usuario = "postgres";
        String pass = "2424";

        try {
            con = DriverManager.getConnection(db, usuario, pass);
        //JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        
        return con;

    }

}
