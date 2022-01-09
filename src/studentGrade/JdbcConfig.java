package studentGrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.SplittableRandom;

public interface JdbcConfig {

    String DRIVER = "com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/text_lxh";
    String USERNAME = "root";
    String PASSWORD = "123456";

}
