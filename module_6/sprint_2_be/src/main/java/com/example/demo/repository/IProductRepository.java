package com.example.demo.repository;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {


    @Query(value = " select * from product " +
            "where id_category = 1 and `name` like :nameProduct and price_sale  BETWEEN :beforePrice and :firstPrice and is_delete = 0   " ,
            countQuery = " select count(*) from ( select * from product " +
                    "where id_category = 1 and `name` like :nameProduct and price_sale BETWEEN :beforePrice and :firstPrice and is_delete = 0  ) temp " ,
            nativeQuery = true)
    Page<Product> searchPriceAndNameLaptop(Pageable pageable,
                                           @Param("nameProduct") String nameProduct,
                                           @Param("beforePrice") Double beforePrice,
                                           @Param("firstPrice") Double firstPrice);


    @Query(value = " select * from product " +
            "where id_category = 2 and `name` like :nameProduct and price_sale  BETWEEN :beforePrice and :firstPrice and is_delete = 0   " ,
            countQuery = " select count(*) from ( select * from product " +
                    "where id_category = 2 and `name` like :nameProduct and price_sale BETWEEN :beforePrice and :firstPrice and is_delete = 0  ) temp " ,
            nativeQuery = true)
    Page<Product> searchPriceAndNamePhone(Pageable pageable,
                                           @Param("nameProduct") String nameProduct,
                                           @Param("beforePrice") Double beforePrice,
                                           @Param("firstPrice") Double firstPrice);


    @Query(value = " SELECT id, cost, `create_date`, `image`," +
            " `is_delete`, `made_in`, `name`," +
            " `price`,`price_sale`,`specifications` ,`status_product`,id_category " +
            " FROM product " +
            " ORDER BY ABS( DATEDIFF( create_date, NOW() ) ) limit 8 ",
            nativeQuery = true)
    List<Product> getProductNearTheDay();

    @Query(value = " select * from product where `name` like :nameSearch and is_delete = 0   ",
            countQuery = " select count(*) from ( select * from product where `name` like :nameSearch and is_delete = 0  ) temp"
            ,nativeQuery = true)
    Page<Product> searchNameProduct(@Param("nameSearch") String nameSearch, Pageable pageable);




}
