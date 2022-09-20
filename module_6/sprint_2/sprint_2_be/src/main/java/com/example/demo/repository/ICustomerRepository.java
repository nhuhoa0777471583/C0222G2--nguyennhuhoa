package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = " select c.* from customer c " +
            " join app_user u on c.user_id = u.id" +
            " where user_name = :userName ", nativeQuery = true)
    Customer getCustomerByUserName(String userName);

}
