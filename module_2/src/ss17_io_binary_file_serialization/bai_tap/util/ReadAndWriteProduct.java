package ss17_io_binary_file_serialization.bai_tap.util;

import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProduct {
    public static List<Product> readProduct() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/ss17_io_binary_file_serialization/bai_tap/util/product.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeProduct(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("src/ss17_io_binary_file_serialization/bai_tap/util/product.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println("file bị lỗi");
        }
    }

}
