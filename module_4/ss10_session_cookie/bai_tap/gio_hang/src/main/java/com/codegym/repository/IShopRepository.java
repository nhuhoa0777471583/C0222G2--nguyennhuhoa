package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IShopRepository extends JpaRepository<Product,Integer> {

    @Query(value = " select * from Shop ", nativeQuery = true)
    List<Product> displayAll();

}
