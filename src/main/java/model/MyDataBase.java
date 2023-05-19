package model;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyDataBase implements IAlmacenDatosDB{
    @Override
    public ArrayList<Usuario> getEmpleados() {
        DataSource dataSource = ConectorDataSource.getMyDataSource();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String query = "select * from usuario";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
        ){
            Usuario usuario;
            while (resultSet.next()){
                usuario = new Usuario(resultSet.getInt("idUsuario"),
                        resultSet.getString(2), resultSet.getString(3),
                        resultSet.getString(4));
                usuarios.add(usuario);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    @Override
    public Usuario getUsuario(String dni) {
        return null;
    }

    @Override
    public int updateUsuario(Usuario empleado) {
        return 0;
    }

    @Override
    public int removeUsuario(String dni) {
        return 0;
    }

    @Override
    public boolean addUsuario(Usuario empleado) {
        return false;
    }

    @Override
    public ArrayList<Usuario> getUsuarioByDni(String dni) {
        return null;
    }


}
