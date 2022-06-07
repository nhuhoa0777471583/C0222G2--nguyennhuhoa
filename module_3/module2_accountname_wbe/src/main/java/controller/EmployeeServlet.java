package controller;

import model.employee.Divition;
import model.employee.Education;
import model.employee.Employee;
import model.employee.Position;
import service.employee.IEmployee;
import service.employee.impl.DivitionServiceImpl;
import service.employee.impl.EducationServiceImpl;
import service.employee.impl.EmployeeServiceImpl;
import service.employee.impl.PositionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployee iEmployee = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showEmployee(request, response);
                break;
            case "delete":
//                showCustomer(request, response);
                break;
            case "edit":
//                showService(request, response);
                break;
            case "search":
//                showContract(request, response);
                break;
            default:
                listEmployee(request, response);
                break;
        }


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                saveEmployee(request, response);
                break;
            case "delete":
//                showCustomer(request, response);
                break;
            case "edit":
//                showService(request, response);
                break;
            case "search":
//                showContract(request, response);
                break;
            default:
//                showFurama(request, response);
                break;
        }
    }


    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = this.iEmployee.getAllEmployee();
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("view/employee/listEmployee.jsp").forward(request, response);
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Divition> divitionList = new DivitionServiceImpl().getAllDivition();
        List<Education> educationList = new EducationServiceImpl().getAllEducationService();
        List<Position> positionList = new PositionServiceImpl().getAllPositionService();
        request.setAttribute("positionList", positionList);
        request.setAttribute("educationList", educationList);
        request.setAttribute("divitionList", divitionList);
        request.getRequestDispatcher("view/employee/createEmployee.jsp").forward(request, response);
    }

    private void saveEmployee(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idCard = request.getParameter("idCard");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idPosition = Integer.parseInt(request.getParameter("idPosition"));
        Integer idEducation = Integer.parseInt(request.getParameter("idEducation"));
        Integer idDivition = Integer.parseInt(request.getParameter("idDivition"));
        Employee employee = new Employee(name, birthday, idCard, salary, phone, email, address, idPosition, idEducation, idDivition);
        this.iEmployee.save(employee);
        request.setAttribute("message", "them moi thanh cong");
        response.sendRedirect("employee");
    }

}

