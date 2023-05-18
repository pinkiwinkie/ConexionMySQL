package model;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConectorDataSource {
    public static DataSource getMyDataSource(){
        Properties properties = new Properties();
        MysqlDataSource mysqlDataSource = null;

        try (FileInputStream fis = new FileInputStream("db.properties")){
            properties.load(fis);
            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setUrl(properties.getProperty("MYSQL_DB_URL"));
            mysqlDataSource.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
//            mysqlDataSource.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mysqlDataSource;
    }

}
