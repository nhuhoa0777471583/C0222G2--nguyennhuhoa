package controller;

import model.LoaiVanPhong;
import model.MatBang;
import model.Tang;
import model.TrangThai;
import service.ILoaiVanPhongService;
import service.IMatBangService;
import service.ITangService;
import service.ITrangThaiService;
import service.impl.LoaiVanPhongServiceImpl;
import service.impl.MatBangServiceImpl;
import service.impl.TangService;
import service.impl.TrangThaiServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "MatBangServlet", urlPatterns = "/matBang")

public class MatBangServlet extends HttpServlet {
    private IMatBangService iMatBangService = new MatBangServiceImpl();
    private ITrangThaiService iTrangThaiService = new TrangThaiServiceImpl();
    private ILoaiVanPhongService iLoaiVanPhongService = new LoaiVanPhongServiceImpl();
    private ITangService iTangService = new TangService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createMatBang(request, response);
                break;
            default:
                displayMatBang(request, response);
                break;
        }

    }


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
                delete(request, response);
                break;
            default:
                displayMatBang(request, response);
                break;
        }
    }


    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<MatBang> matBangList = this.iMatBangService.getAll();
        List<TrangThai> trangThaiList = this.iTrangThaiService.getAll();
        List<LoaiVanPhong> loaiVanPhongList = this.iLoaiVanPhongService.getAll();
        List<Tang> tangList = this.iTangService.getAll();
        request.setAttribute("matBangList", matBangList);
        request.setAttribute("trangThaiList", trangThaiList);
        request.setAttribute("loaiVanPhongList", loaiVanPhongList);
        request.setAttribute("tangList", tangList);
        try {
            request.getRequestDispatcher("view/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void displayMatBang(HttpServletRequest request, HttpServletResponse response) {
        List<MatBang> matBangList = this.iMatBangService.getAll();
        List<TrangThai> trangThaiList = this.iTrangThaiService.getAll();
        List<LoaiVanPhong> loaiVanPhongList = this.iLoaiVanPhongService.getAll();
        List<Tang> tangList = this.iTangService.getAll();
        request.setAttribute("matBangList", matBangList);
        request.setAttribute("trangThaiList", trangThaiList);
        request.setAttribute("loaiVanPhongList", loaiVanPhongList);
        request.setAttribute("tangList", tangList);
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createMatBang(HttpServletRequest request, HttpServletResponse response) {
        String maMatBang = request.getParameter("maMatBang");
        Double dienTich = Double.parseDouble(request.getParameter("dienTich"));
        Integer trangThai = Integer.parseInt(request.getParameter("trangThai"));
        Integer tang = Integer.parseInt(request.getParameter("maTang"));
        Integer loaiVanPhong = Integer.parseInt(request.getParameter("loaiVanPhong"));
        String moTa = request.getParameter("moTa");
        Double gia = Double.parseDouble(request.getParameter("gia"));
        String ngayBatDau = request.getParameter("ngayBatDau");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        MatBang matBang = new MatBang(maMatBang, dienTich, trangThai, tang, loaiVanPhong, moTa, gia, ngayBatDau, ngayKetThuc);
        this.iMatBangService.save(matBang);
        List<TrangThai> trangThaiList = this.iTrangThaiService.getAll();
        List<LoaiVanPhong> loaiVanPhongList = this.iLoaiVanPhongService.getAll();
        List<Tang> tangList = this.iTangService.getAll();
        request.setAttribute("matBang", matBang);
        request.setAttribute("trangThaiList", trangThaiList);
        request.setAttribute("loaiVanPhongList", loaiVanPhongList);
        request.setAttribute("tangList", tangList);
        try {
            response.sendRedirect("matBang");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("idDelete");
        this.iMatBangService.delete(id);
        response.sendRedirect("/matBang");
    }
}
