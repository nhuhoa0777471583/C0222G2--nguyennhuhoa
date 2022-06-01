package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "bánh", 1000, "ngon", "VN"));
        productList.add(new Product(2, "kẹo", 3000, "sắp hết", "mikita"));
        productList.add(new Product(3, "sữa", 20000, "ngon", "vinamilk"));
        productList.add(new Product(4, "coca", 50000, "ngon", "coca"));
        productList.add(new Product(5, "bia", 10000, "ngon", "larue"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i <= productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return productList.get(i);
            }
        }
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
      for (Product pro : productList){
          if(id == pro.getId())
              pro.setName(product.getName());
              pro.setGiaBan(product.getGiaBan());
              pro.setMoTa(product.getMoTa());
              pro.setNhaSanXuat(product.getNhaSanXuat());
            }
        }


    @Override
    public void remove(int id) {
        for (Product pro : productList){
            if(id == pro.getId()){
                productList.remove(pro);
                break;
            }
        }
    }
}
