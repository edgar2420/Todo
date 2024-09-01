/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.sql.ResultSet;
import Logica.Conexion;

public class Controlador extends Conexion{
    
    public ResultSet DevolverRegistro(String sql){
    try {
        this.st=this.conectarPG().createStatement();
        this.rs=this.st.executeQuery(sql);
    }
    catch(Exception ex){ex.printStackTrace();}
    return this.rs;
}
    
    public String DevolverDatosSql(String sql, int colselect){
    String Datos="";
    try {
        this.rs=DevolverRegistro(sql);while(this.rs.next()){Datos=this.rs.getString(colselect);
        }
    } catch (Exception e) { }return Datos;
}
}

