import model.ConectorDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection connection;
        try{
            DataSource dataSource = ConectorDataSource.getMyDataSource();
            connection = dataSource.getConnection();
            if (connection != null)
                System.out.println("acceso exitoso");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
