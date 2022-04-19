package ss12_java_collection_framework.bai_tap.quan_li_san_pham.service;

import ss12_java_collection_framework.bai_tap.quan_li_san_pham.comparator_product.ComparatorProduct;
import ss12_java_collection_framework.bai_tap.quan_li_san_pham.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "iphone", 50, 10));
        products.add(new Product(2, "samsung", 100, 2));
        products.add(new Product(3, "nokia", 2, 1));
    }

    @Override
    public void them() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("nhap gia ca: ");
        int gia = Integer.parseInt(scanner.nextLine());

        System.out.print("nhap so luong: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, tenSanPham, gia, soLuong);
        System.out.println(product);
        products.add(product);
    }

    @Override
    public void hienThi() {
        for (Product product1 : products) {
            System.out.println(product1);
        }
    }

    @Override
    public void sua() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean tonTaiID = false;
        for (int i = 0; i < products.size(); i++) {
            if (id == (products.get(i).getId())) {
                tonTaiID = true;
                System.out.print("nhap ten san pham: ");
                String tenSanPham = scanner.nextLine();

                System.out.print("nhap gia ca: ");
                int gia = Integer.parseInt(scanner.nextLine());

                System.out.print("nhap so luong: ");
                int soLuong = Integer.parseInt(scanner.nextLine());

                Product product = new Product(id, tenSanPham, gia, soLuong);
                products.set(i, product);
                break;

            }
        }
        if (tonTaiID == false) {
            System.out.println("ko co id");

        }
    }

    @Override
    public void xoa() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
            for (int i = 0; i < products.size(); i++) {
                if (id == (products.get(i).getId())) {
                    flag = true;
                    break;
                }
            }

        if (flag) {
            for (int i = 0; i < products.size(); i++) {
                if (id == (products.get(i).getId())) {
                    products.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("Khong ton tai!");
        }
    }


    @Override
    public void timKiem() {
        System.out.print("nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < products.size(); i++) {
            if (tenSanPham.equals(products.get(i).getTenSanPham())) {
                System.out.println("ten san pham can tim: " + products.get(i).getTenSanPham());
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko co sp");
        }
    }

    @Override
    public void sapXep() {
        System.out.println("1.muon tang" +
                "2.giam dan");
        System.out.println("moi chon:");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("muon tang");
                Collections.sort(products, new ComparatorProduct());
                break;
            case 2:
                System.out.println("muon giam");
                Collections.sort(products, new ComparatorProduct());
                Collections.reverse(products);
                break;
        }
    }
}
