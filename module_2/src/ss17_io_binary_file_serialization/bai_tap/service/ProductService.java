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

    }
}
