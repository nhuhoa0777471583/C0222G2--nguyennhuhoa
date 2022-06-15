package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FuramaServlet", urlPatterns = "/furama")
public class FuramaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "employee":
                new EmployeeServlet().doGet(request, response);
                break;
            case "customer":
                new CustomerServlet().doGet(request, response);
                break;
            case "service":
                new ServiceServlet().doGet(request, response);
                break;
            case "contract":
//                showContract(request, response);
                break;
            default:
                showFurama(request, response);
                break;
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    private void showFurama(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/view.jsp");
        dispatcher.forward(request, response);

    }
//
//    private void showCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Customer> customerList= new CustomerServiceImpl().getAll();
//        request.setAttribute("customerList",customerList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/customer/listCustomer.jsp");
//        dispatcher.forward(request,response);
//    }

//    private void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    List<Employee> employeeList = new EmployeeService().getAllEmployee();
//    request.setAttribute("employeeList",employeeList);
//    request.getRequestDispatcher("/view/employee/listEmployee.jsp").forward(request,response);
//    }

}
