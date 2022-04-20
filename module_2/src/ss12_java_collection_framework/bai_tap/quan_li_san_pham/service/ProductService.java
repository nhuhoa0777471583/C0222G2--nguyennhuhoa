package ss12_java_collection_framework.bai_tap.quan_li_san_pham.service;

import ss12_java_collection_framework.bai_tap.quan_li_san_pham.comparator_product.ComparatorProduct;
import ss12_java_collection_framework.bai_tap.quan_li_san_pham.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
//    private static ArrayList<Product> products = new ArrayList<>();
    private static LinkedList<Product> products=new LinkedList<>();

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

        //them cac gia tri moi vao doi tuong
        //roi them vao list
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
        //duyet list neu co id trong list thi dung va cho sua lai gia tri do
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
        //neu ko co thi thong bao ra
        if (tonTaiID == false) {
            System.out.println("ko co id");

        }
    }

    @Override
    public void xoa() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        //duyet list neu co id thi dung
            for (int i = 0; i < products.size(); i++) {
                if (id == (products.get(i).getId())) {
                    flag = true;
                    break;
                }
            }
        // dusng thi duyet list vao xoa
        if (flag==true) {
            for (int i = 0; i < products.size(); i++) {
                if (id == (products.get(i).getId())) {
                    products.remove(i);
                    break;
                }
            }
        }
        //sai thi thong bao ra
        else {
            System.out.println("Khong ton tai!");
        }
    }


    @Override
    public void timKiem() {
        System.out.print("nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        boolean flag = false;
        //duyet list
        //so sanh tenSp voi list thi sd pthuc equals de ss chuoi
        //neu co thi in ra
        for (int i = 0; i < products.size(); i++) {
            if (tenSanPham.equals(products.get(i).getTenSanPham())) {
                System.out.println("ten san pham can tim: " + products.get(i).getTenSanPham());
                flag = true;
                break;
            }
        }
        //ko co thi thong bao
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
                //tao class comparator de so sanh gia
                System.out.println("muon tang");
                Collections.sort(products, new ComparatorProduct());
                break;
            case 2:
                System.out.println("muon giam");
                Collections.sort(products, new ComparatorProduct());
                // sdung reverse de dao nguoc tang thanh giam
                Collections.reverse(products);
                break;
        }
    }
}
