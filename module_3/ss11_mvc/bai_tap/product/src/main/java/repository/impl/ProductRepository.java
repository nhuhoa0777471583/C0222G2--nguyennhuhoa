package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "bánh", 1000, 100));
        productList.add(new Product(2, "kẹo", 30000, 100));
        productList.add(new Product(3, "sữa", 20000, 100));
        productList.add(new Product(4, "coca", 50000, 100));
        productList.add(new Product(5, "bia", 25000, 200));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i <= productList.size(); i++) {
            if (id == productList.get(i).getId()){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
