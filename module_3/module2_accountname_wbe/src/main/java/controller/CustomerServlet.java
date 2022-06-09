package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer.CustomerServiceImpl;
import service.customer.CustomerTypeServiceImpl;
import service.customer.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    private ICustomerService iCustomerService = new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            default:
                listCustomer(request, response);
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
                saveCustomer(request, response);
                break;
            case "edit":
                update(request, response);
                break;

        }
    }


    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = iCustomerService.getAll();
        List<CustomerType> customerTypeList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/listCustomer.jsp").forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypeList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerType", customerTypeList);
        request.getRequestDispatcher("view/customer/createCustomer.jsp").forward(request, response);
    }

    private void saveCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idCustomerType = Integer.valueOf(request.getParameter("idCustomerType"));
        Customer customer = new Customer(name, birthday, gender, idCard, phone, email, address, idCustomerType);

        Map<String,String> errorMap = this.iCustomerService.validateCreate(customer);
        if(errorMap.isEmpty()){
            response.sendRedirect("customer");
        }else {
            request.setAttribute("errorMap",errorMap);
            request.setAttribute("customer",customer);
            request.setAttribute("customerType",new CustomerTypeServiceImpl().getAllCustomerType());
            try {
                request.getRequestDispatcher("view/customer/createCustomer.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        iCustomerService.delete(id);
        List<Customer> customerList = iCustomerService.getAll();
        List<CustomerType> customerTypeList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/listCustomer.jsp").forward(request, response);
    }


    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.findById(id);
        request.setAttribute("customer", customer);
        List<CustomerType> customerTypeList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        request.getRequestDispatcher("view/customer/editCustomer.jsp").forward(request, response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id =Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idCustomerType = Integer.parseInt(request.getParameter("idCustomerType"));
        Customer customerUpdate = new Customer(id,name, birthday, gender, idCard, phone, email, address, idCustomerType);
        Map<String,String> errorMap = this.iCustomerService.validateEdit(customerUpdate);
        if(errorMap.isEmpty()){
            response.sendRedirect("customer");
        }else {
            request.setAttribute("errorMap",errorMap);
            request.setAttribute("customer",customerUpdate);
            request.setAttribute("customerTypeList" , new CustomerTypeServiceImpl().getAllCustomerType());
            request.getRequestDispatcher("view/customer/editCustomer.jsp").forward(request,response);
        }
    }


    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
    String nameSearch = request.getParameter("nameSearch");
    List<Customer> customerList = this.iCustomerService.searchByName(nameSearch);
    request.setAttribute("customerList", customerList);
    request.setAttribute("nameSearch",nameSearch);
        try {
            request.getRequestDispatcher("view/customer/listCustomer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
