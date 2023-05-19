package model;

public class Usuario {
    private int idUsuario;
    private String nombre,
            apellidos,
            dni;

    public Usuario(int idUsuario, String nombre, String apellidos, String dni) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public int getIdUsuario() {
        return idUsuario;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
