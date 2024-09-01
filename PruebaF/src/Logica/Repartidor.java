/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class Repartidor {
    int ci_id;
    String nombre;
    String apellido;
    String telefono;
    String Nacimiento;
    
    public Repartidor() {
    }
    

    public Repartidor(int ci_id, String nombre, String apellido, String telefono, String Nacimiento) {
        this.ci_id = ci_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.Nacimiento = Nacimiento;
    }

    public int getCi_id() {
        return ci_id;
    }

    public void setCi_id(int ci_id) {
        this.ci_id = ci_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    
    
}
