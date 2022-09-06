package com.example.demo.repository;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

//  @Query(value=" select dto_product.id, dto_product.cost, dto_product.`create_date`, dto_product.`image`, " +
//          " dto_product.`is_delete`, dto_product.`made_in`, dto_product.`name`, " +
//          " dto_product.`price`,dto_product.`specifications` ,dto_product.`status_product` " +
//          " from product" +
//          " ( select product.id, product.cost, product.`create_date`, product.`image`, " +
//          " product.`is_delete`, product.`made_in`, product.`name`, " +
//          " product.`price`,product.`specifications` ,product.`status_product`, " +
//          " from product " +
//          " join category on product.id_category = category.id where category.`name` = 'laptop' ) as dto_product ",
//          nativeQuery = true)
//  List<ProductDto> getLaptop();


    @Query(value = " select id,cost, `create_date`, `image`," +
            " `is_delete`, `made_in`, `name`," +
            " `price`,`price_sale`,`specifications` ,`status_product`,id_category " +
            " from product  " +
            " where id_category = 1 and is_delete = 0 ", nativeQuery = true)
    List<Product> getLaptop();

    @Query(value = " select id,cost, `create_date`, `image`," +
            " `is_delete`, `made_in`, `name`," +
            " `price`,`price_sale`,`specifications` ,`status_product`,id_category " +
            " from product  " +
            " where id_category = 2 and is_delete = 0 ", nativeQuery = true)
    List<Product> getPhone();

    @Query(value = "SELECT id, cost, `create_date`, `image`," +
            " `is_delete`, `made_in`, `name`," +
            " `price`,`price_sale`,`specifications` ,`status_product`,id_category " +
            " FROM product " +
            " ORDER BY ABS( DATEDIFF( create_date, NOW() ) ) limit 8 ", nativeQuery = true)
    List<Product> getProductNearTheDay();


}
