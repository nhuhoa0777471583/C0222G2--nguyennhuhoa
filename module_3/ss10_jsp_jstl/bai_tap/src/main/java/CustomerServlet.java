import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer[] customer = new Customer[5];
        customer[0]= new Customer("hoa0","1/2/2002","da nang","data:image/jpeg;base64,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");
        customer[1]= new Customer("hoa1","1/2/2002","da nang","https://images.unsplash.com/photo-1644982647708-0b2cc3d910b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
        customer[2]= new Customer("hoa2","1/2/2002","da nang","https://images.unsplash.com/photo-1644982647708-0b2cc3d910b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
        customer[3]= new Customer("hoa3","1/2/2002","da nang","https://images.unsplash.com/photo-1644982647708-0b2cc3d910b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");
        customer[4]= new Customer("hoa4","1/2/2002","da nang","https://images.unsplash.com/photo-1644982647708-0b2cc3d910b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");

        request.setAttribute("cus", customer);
        request.getRequestDispatcher("customer.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}