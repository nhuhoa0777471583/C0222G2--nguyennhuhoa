package controller;

import model.employee.Employee;
import service.employee.EmployeeService;
import service.employee.IEmployee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployee iEmployee = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                showEmployee(request, response);
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
//                showEmployee(request, response);
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
        request.getRequestDispatcher("view/employee/listEmployee.jsp").forward(request,response);

    }
}

