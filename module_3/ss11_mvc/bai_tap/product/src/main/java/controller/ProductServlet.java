package controller;

import model.Product;
import service.IProductService;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("create.jsp").forward(request, response);
                break;
            case "edit":
                getEdit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "detail":
                getInfoProduct(request, response);
                break;

            default:
                showListProduct(request, response);
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
                editInfoProduct(request, response);
                break;
            case "search" :
                searchInfoProduct(request,response);
            default:
                showListProduct(request, response);
                break;
        }
    }


    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = this.productService.getAll();
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer gia = Integer.parseInt(request.getParameter("gia"));
        String moTa = request.getParameter("moTa");
        String nhaSanXuat = request.getParameter("nhaSanXuat");
        Product product = new Product(id, name, gia, moTa, nhaSanXuat);
        this.productService.save(product);
        request.setAttribute("message", "thêm mới thành công");
        showListProduct(request, response);
//        response.sendRedirect("/product");
    }


    private void getEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("productList", product);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

    private void editInfoProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int gia = Integer.parseInt(request.getParameter("gia"));
        String moTa = request.getParameter("moTa");
        String nhaSanXuat = request.getParameter("nhaSanXuat");

        Product product = new Product(id, name, gia, moTa, nhaSanXuat);
        this.productService.update(id,product);
        request.setAttribute("message", "sửa thành công");
        showListProduct(request, response);

    }

    //chưa xoá đc
    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productService.remove(id);
        request.setAttribute("message", "xoá thành công");
        showListProduct(request, response);
    }

//    xem thông tin chi tiết sản phẩm
    private void getInfoProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        Product product = this.productService.findById(id);
        request.setAttribute("productList", product);
        request.getRequestDispatcher("detail.jsp").forward(request, response);
    }

//   search thông tin
    private void searchInfoProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");
        List<Product> product = this.productService.searchInfo(search);
        request.setAttribute("productList", product);
        request.getRequestDispatcher("search.jsp").forward(request, response);
    }

}
