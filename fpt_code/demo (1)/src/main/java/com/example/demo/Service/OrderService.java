package com.example.demo.Service;

import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Product;

import java.util.List;

public interface OrderService {
    List<Orders> getAll();
    void delete(Integer id);
    Orders detail(Integer id);
    void  insert(Orders orders);
    void update(Orders orders);
}
