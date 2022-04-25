package ss17_io_binary_file_serialization.bai_tap.controller;

import ss17_io_binary_file_serialization.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner=new Scanner(System.in);
    private static ProductService productService=new ProductService();
    public static void display(){
        while (true){
            System.out.print("Các chức năng:\n"+
                    "0.Quay lại\n"+
                    "1.Thêm\n"+
                    "2.Hiển thị\n"+
                    "3.Tìm kiếm\n"+
                    "Chọn chức năng: ");
            int chose=Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    System.out.println("Thêm");
                    productService.them();
                    break;
                case 2:
                    System.out.println("Hiển thị");
                    new ProductService().hienThi();
                    break;
                case 3:
                    System.out.println("Tìm kiếm");
                    new ProductService().timKiem();
                    break;
                case 0:
                    System.out.println("quay lại");
                    return;
                default:
                    System.out.println("-------nhập lại------");
                    break;
            }
        }
    }
}
