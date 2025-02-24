import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Temporary storage for employees
    private static List<Employee> employees = new ArrayList<>();

    static {
        // Adding some sample employees
        employees.add(new Employee(1, "John Doe", "Manager", 50000));
        employees.add(new Employee(2, "Jane Smith", "Developer", 45000));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("view".equals(action)) {
            request.setAttribute("employees", employees);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/viewEmployees.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String position = request.getParameter("position");
            double salary = Double.parseDouble(request.getParameter("salary"));

            Employee newEmployee = new Employee(id, name, position, salary);
            employees.add(newEmployee);
            response.sendRedirect("EmployeeController?action=view");
        }
    }
}
