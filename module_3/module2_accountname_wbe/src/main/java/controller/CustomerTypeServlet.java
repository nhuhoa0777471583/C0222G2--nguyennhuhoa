package controller;

import model.Customer;
import model.CustomerType;
import service.customer.CustomerTypeServiceImpl;
import service.customer.ICustomerTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerTypeServlet", urlPatterns = "/customertype")
public class CustomerTypeServlet extends HttpServlet {
    private ICustomerTypeService iCustomerTypeService = new CustomerTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                showCustomer(request, response);
                break;
//            case "delete":
////                showCustomer(request, response);
//                break;
//            case "edit":
////                showCustomer(request, response);
//                break;
//            case "search":
////                showCustomer(request, response);
//                break;
            default:
                listCustomerType(request, response);
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
        }
    }

    private void listCustomerType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypeList = iCustomerTypeService.getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        dispatcher.forward(request, response);
    }
}
