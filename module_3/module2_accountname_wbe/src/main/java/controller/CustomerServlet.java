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
import java.util.List;

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
//            case "search":
////                showCustomer(request, response);
//                break;
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
            case "delete":
//                showCustomer(request, response);
                break;
            case "edit":
                update(request, response);
                break;
            case "search":
//                showContract(request, response);
                break;
        }
    }


    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = iCustomerService.getAll();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/listCustomer.jsp").forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/create.jsp").forward(request, response);
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
        this.iCustomerService.save(customer);
        request.setAttribute("message", "thêm mới thành công");
        response.sendRedirect("customer");
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
//        iCustomerService.edit(id);
        List<Customer> customerList = iCustomerService.getAll();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("listCustomer.jsp").forward(request, response);

    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Customer customerList = iCustomerService.findById(id);
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/editCustomer.jsp").forward(request, response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name_customer");
        String birthday = request.getParameter("birthday_customer");
        Integer gender = Integer.parseInt(request.getParameter("gender_customer"));
        String idCard = request.getParameter("id_card_customer");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idCustomerType = Integer.parseInt(request.getParameter("id_customer_type"));
        Customer customerUpdate = new Customer(name, birthday, gender, idCard, phone, email, address, idCustomerType);
        iCustomerService.edit(customerUpdate);
        List<CustomerType> customerList = new CustomerTypeServiceImpl().getAllCustomerType();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("view/customer/editCustomer.jsp").forward(request, response);
    }

}
