package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FuramaServlet", value = "/furama")
public class FuramaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "employee":
//                showEmployee(request, response);
                break;
            case "customer":
//                showCustomer(request, response);
                break;
            case "service":
//                showService(request, response);
                break;
            case "contract":
//                showContract(request, response);
                break;
            default:
//                showFurama(request, response);
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
            case "employee":
//                showNewForm(request, response);
                break;
            case "customer":
//                showEditForm(request, response);
                break;
            case "service":
//                deleteUser(request, response);
                break;
            case "contract":
//                orderByName(request, response);
                break;
            default:
//                homeFurama(request, response);
                break;
        }
    }
}
