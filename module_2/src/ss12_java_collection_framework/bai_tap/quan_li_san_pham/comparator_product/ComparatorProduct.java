package ss12_java_collection_framework.bai_tap.quan_li_san_pham.comparator_product;

import ss12_java_collection_framework.bai_tap.quan_li_san_pham.model.Product;

import java.util.Comparator;

public class ComparatorProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getGiaCa()-o2.getGiaCa();
    }
}
