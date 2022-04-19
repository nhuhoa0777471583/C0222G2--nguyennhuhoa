package ss12_java_collection_framework.bai_tap.quan_li_san_pham.controller;

import ss12_java_collection_framework.bai_tap.quan_li_san_pham.model.Product;
import ss12_java_collection_framework.bai_tap.quan_li_san_pham.service.ProductService;

import java.util.Scanner;

public class ControllerProduct {
    private static Scanner scanner = new Scanner(System.in);

    public void display() {
        while (true){
            System.out.print("1.Thêm\n" +
                    "2.Sửa \n" +
                    "3.Xoá \n" +
                    "4.Hiển thị \n" +
                    "5.Tìm kiếm \n" +
                    "6.Sắp xếp \n" +
                    "7.Thoat \n" +
                    "chon chuc nang: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Thêm sản phẩm:\n ");
                    new ProductService().them();
                    break;
                case 2:
                    System.out.print("Sửa thông tin sản phẩm theo id:\n ");
                    new ProductService().sua();
                    break;
                case 3:
                    System.out.print("Xoá sản phẩm theo id:\n");
                    new ProductService().xoa();
                    break;
                case 4:
                    System.out.print("Hiển thị danh sách sản phẩm:\n");
                    new ProductService().hienThi();
                    break;
                case 5:
                    System.out.print("Tìm kiếm sản phẩm theo tên:\n");
                    new ProductService().timKiem();
                    break;
                case 6:
                    System.out.print("Sắp xếp sản phẩm tăng dần, giảm dần theo giá:\n");
                    new ProductService().sapXep();
                    break;
                default:
                   System.exit(0);
                    break;
            }
        }
    }
}