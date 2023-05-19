import model.IAlmacenDatosDB;
import model.MyDataBase;
import model.Usuario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAlmacenDatosDB db = new MyDataBase();
        List<Usuario> usuarios = db.getEmpleados();
        System.out.println(usuarios);
    }
}
