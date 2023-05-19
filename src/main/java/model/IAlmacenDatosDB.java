package model;

import java.util.ArrayList;

public interface IAlmacenDatosDB {
    ArrayList<Usuario> getEmpleados();
    Usuario getUsuario(String dni);
    int updateUsuario(Usuario empleado);
    int removeUsuario(String dni);
    boolean addUsuario(Usuario empleado);
    //boolean authenticate(String login, String passwd);
    ArrayList<Usuario> getUsuarioByDni(String dni) ;
}
