import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    

    public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException {

        String INSERT_USERS_SQL = "INSERT INTO employee (name) VALUES (?);";
        Class.forName(JDBC_DRIVER);

        Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)
        preparedStatement.setString(1, employee.getName()); // ID is auto-incremented, so no need to set it.

        System.out.println(preparedStatement);
        int result = preparedStatement.executeUpdate();

        return result;
    }
}
