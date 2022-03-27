import java.io.*;
import java.sql.*;

class JDBCSingletonEarly {

    private static final string JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final string DB_URL = "jdbc:mysql://localhost/test";
    private static final string USER = "root";
    private static final string PASS = "";

    private static JDBCSingletonEarly jdbc = new JDBCSingletonEarly();
    private static Connection con;

    private JDBCSingletonEarly() {}

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        return con;
    }

    public static JDBCSingletonEarly getInstance() {
        return jdbc;
    }
}
