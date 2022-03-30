import java.io.*;
import java.sql.*;

class JDBCSingletonLazy {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String USER = "root";
    private static final String PASS = "";

    private static JDBCSingletonLazy jdbc;
    private static Connection con;

    private JDBCSingletonLazy() {}

    //Now we are providing gloabal point of access through lazy initialization. 
    public static JDBCSingletonLazy getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingletonLazy();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        return con;
    }
}
