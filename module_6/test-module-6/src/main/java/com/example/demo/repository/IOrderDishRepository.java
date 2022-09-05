package com.example.demo.repository;

import com.example.demo.model.OrderDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IOrderDishRepository extends JpaRepository<OrderDish, Integer> {

}
