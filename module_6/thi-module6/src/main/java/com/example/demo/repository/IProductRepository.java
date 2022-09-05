package com.example.demo.repository;

import com.example.demo.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = " select * from product where is_deleted = 0 ", nativeQuery = true)
    List<Product> displayProduct();

    @Transactional
    @Modifying
    @Query(value = " UPDATE product SET is_deleted = 1 WHERE ( product.id = :idKey) ", nativeQuery = true)
    void deleteProduct(@Param("idKey") Integer id);


}
