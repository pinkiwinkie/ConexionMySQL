package model;

import java.util.ArrayList;

public interface AlmacenDatosDB {
    ArrayList<Usuario> getEmpleados();
    Usuario getUsuario(int id);
    int updateUsuario(Usuario empleado);
    int removeUsuario(int id);
    boolean addUsuario(Usuario empleado);
    boolean authenticate(String login, String passwd);
    ArrayList<Usuario> getUsuarioByOficio(String oficio) ;
}
