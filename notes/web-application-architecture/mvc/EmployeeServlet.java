import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDao;

    public void init() {
        employeeDao = new EmployeeDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        Employee employee = new Employee(firstName, lastName);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("employeeRegisterSuccess.jsp");
    }
}
