package ss17_io_binary_file_serialization.bai_tap.service;

import ss17_io_binary_file_serialization.bai_tap.model.Product;
import ss17_io_binary_file_serialization.bai_tap.util.ReadAndWriteProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();

    static {
    }

    @Override
    public void them() {
        System.out.print("them id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("them ten san pham: ");
        String tenSanPham = sc.nextLine();
        System.out.print("them hang san xuat: ");
        String hangSanXuat = sc.nextLine();
        System.out.print("them gia: ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.print("them mo ta san pham: ");
        String moTaSanPham = sc.nextLine();
        Product pr = new Product(id, tenSanPham, hangSanXuat, gia, moTaSanPham);
        productList.add(pr);
        ReadAndWriteProduct.writeProduct(productList);

    }

    @Override
    public void hienThi() {
        productList = ReadAndWriteProduct.readProduct();
        for (Product products : productList) {
            System.out.println(products);
        }
    }

    @Override
    public void timKiem() {
        productList= ReadAndWriteProduct.readProduct();
        System.out.println("nhập tên sản phẩm cần tìm: ");
        String tenSanPham= sc.nextLine();
        boolean flag= false;
        for (int i = 0; i < productList.size(); i++) {
            if(tenSanPham.equals(productList.get(i).getTenSanPham())){
                System.out.println("tên sản phẩm cẩn tìm: ");
                System.out.println(productList.get(i).getTenSanPham());
                flag =true;
            }
        }if(flag==false){
            System.out.println("ko có tên sản phẩm trong file");
        }
    }
}
