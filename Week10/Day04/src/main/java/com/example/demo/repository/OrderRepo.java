package com.example.demo.repository;

import com.example.demo.model.Order;
import com.example.demo.model.OrderResponseDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {
    List<Order> findAllByStatus(String status);
}

