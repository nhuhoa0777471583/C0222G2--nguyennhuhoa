package controller;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import service.sevice.IServiceService;
import service.sevice.impl.RentTypeServiceImpl;
import service.sevice.impl.ServceTypeServiceImpl;
import service.sevice.impl.ServiceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {

    private IServiceService iServiceService = new ServiceServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                new EmployeeServlet().doGet(request,response);
                break;
            case "customer":
//                new CustomerServlet().doGet(request,response);
                break;
            case "service":
//                showService(request, response);
                break;
            case "contract":
//                showContract(request, response);
                break;
            default:
                showService(request, response);
                break;
        }

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }



    private void showService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = this.iServiceService.getAllService();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        request.setAttribute("serviceList",serviceList);
        request.setAttribute("rentTypeList",rentTypeList);
        request.setAttribute("serviceTypeList",serviceTypeList);
        request.getRequestDispatcher("view/service/listService.jsp").forward(request,response);

    }

}
