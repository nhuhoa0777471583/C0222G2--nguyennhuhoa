package com.example.demo.repository;

import com.example.demo.model.product.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOrderRepository extends JpaRepository<OrderProduct, Integer> {



    @Query(value =" select customer.name, order_product.code_service, product.code_product, product_type.`name`, order_product.cost, order_product.date_order, (product_type.price * order_product.cost) as total " +
            " from  order_product " +
            " join customer on customer.id = order_product.id_customer " +
            " join product on product.id = order_product.id_product " +
            " join product_type on product_type.id = product.id_product_type ", nativeQuery = true)
    List<OrderProduct> getAllOrder();
}
