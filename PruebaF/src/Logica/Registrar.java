package Logica;

/**
 *
 * @author Edgar Rojas 
 */
public class Registrar {
    int id;
    String nombres;
    String apellidos;
    String correoelectronico;
    int telefono;
    String Contraseña;
    String ConfirmarContraseña;

 public Registrar() {
    }

    public Registrar(int id, String nombres, String apellidos, String correoelectronico, int telefono, String Contraseña, String ConfirmarContraseña) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoelectronico = correoelectronico;
        this.telefono = telefono;
        this.Contraseña = Contraseña;
        this.ConfirmarContraseña = ConfirmarContraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConfirmarContraseña() {
        return ConfirmarContraseña;
    }

    public void setConfirmarContraseña(String ConfirmarContraseña) {
        this.ConfirmarContraseña = ConfirmarContraseña;
    }
}

   