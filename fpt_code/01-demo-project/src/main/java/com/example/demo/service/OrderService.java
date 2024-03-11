package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    Order finById(Integer id);

    Order save(Order order);
    void update(Order order);

    void delete(Integer id);

    void deleteOrderByUsername(String username);
}
