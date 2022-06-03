package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {

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
}

