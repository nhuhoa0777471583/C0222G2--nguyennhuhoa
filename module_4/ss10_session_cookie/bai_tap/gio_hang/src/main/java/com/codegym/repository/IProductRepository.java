package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = " select * from Product ", nativeQuery = true)
    Iterable<Product> displayAll();

    @Query(value = " select * from Product where id = :id ", nativeQuery = true)
    Optional<Product> displayById(@Param("id") Integer id);
}
