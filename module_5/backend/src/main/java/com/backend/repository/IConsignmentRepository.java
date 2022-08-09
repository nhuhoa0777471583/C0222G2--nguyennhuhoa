package com.backend.repository;

import com.backend.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsignmentRepository extends JpaRepository<Consignment, Integer> {
    @Query(value = " select consignment.* from consignment join product on product.id = consignment.id_product where product.name like :key ",
            countQuery = " select count(*) from ( select consignment.* from consignment join product on product.id = consignment.id_product where product.name like :key ) temp",
            nativeQuery = true)
    Page<Consignment> getAllAndSearchNameProduct(@Param("key") String nameSearch, Pageable pageable);

//    @Query(value = " select * from consignment where id = :id ", nativeQuery = true)
//    Consignment displayFindById(Integer id);

}
