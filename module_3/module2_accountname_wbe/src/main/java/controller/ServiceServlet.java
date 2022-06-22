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
                showCreate(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                showService(request, response);
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
                create(request, response);
                break;
            case "edit":
                update(request, response);
                break;
        }
    }


    private void create(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Integer area = Integer.parseInt(request.getParameter("area"));
        Double cost = Double.parseDouble(request.getParameter("cost"));
        Integer maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        Double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        Integer numberofFloat = Integer.parseInt(request.getParameter("numberofFloat"));
        Integer idRentType = Integer.parseInt(request.getParameter("idRentType"));
        Integer idServiceType = Integer.parseInt(request.getParameter("idServiceType"));
        Service service = new Service(name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience,
                poolArea, numberofFloat, idRentType, idServiceType);
        this.iServiceService.save(service);
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        request.setAttribute("service", service);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.setAttribute("rentTypeList", rentTypeList);
        try {
            response.sendRedirect("service");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void showService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = this.iServiceService.getAllService();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        request.setAttribute("serviceList", serviceList);
        request.setAttribute("rentTypeList", rentTypeList);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.getRequestDispatcher("view/service/listService.jsp").forward(request, response);

    }


    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = this.iServiceService.getAllService();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        request.setAttribute("serviceList", serviceList);
        request.setAttribute("rentTypeList", rentTypeList);
        request.setAttribute("serviceTypeList", serviceTypeList);
        try {
            request.getRequestDispatcher("view/service/createService.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void delete(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        this.iServiceService.delete(id);
        List<Service> serviceList = this.iServiceService.getAllService();
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        request.setAttribute("serviceList", serviceList);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.setAttribute("rentTypeList", rentTypeList);
        try {
            response.sendRedirect("service");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Service service = this.iServiceService.findById(id);
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        request.setAttribute("service", service);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.setAttribute("rentTypeList", rentTypeList);

        try {
            request.getRequestDispatcher("view/service/editService.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer area = Integer.parseInt(request.getParameter("area"));
        Double cost = Double.parseDouble(request.getParameter("cost"));
        Integer maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        Double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        Integer numberofFloat = Integer.parseInt(request.getParameter("numberofFloat"));
        Integer idRentType = Integer.parseInt(request.getParameter("idRentType"));
        Integer idServiceType = Integer.parseInt(request.getParameter("idServiceType"));
        Service service = new Service(id,name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience,
                poolArea, numberofFloat, idRentType, idServiceType);
        this.iServiceService.update(service);
        List<ServiceType> serviceTypeList = new ServceTypeServiceImpl().getAllServiceType();
        List<RentType> rentTypeList = new RentTypeServiceImpl().getAllRentType();
        request.setAttribute("service", service);
        request.setAttribute("serviceTypeList", serviceTypeList);
        request.setAttribute("rentTypeList", rentTypeList);
        try {
            response.sendRedirect("service");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            request.getRequestDispatcher("view/service/editService.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String nameSearchService = request.getParameter("nameSearchService");
        List<Service> serviceList =  this.iServiceService.searchName(nameSearchService);
        request.setAttribute("serviceList",serviceList);
        request.setAttribute("nameSearchService",nameSearchService);
        try {
            request.getRequestDispatcher("view/service/listService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
