package com.example.demo.service;

import com.example.demo.entity.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    List<OrderDetails> getAll();

    OrderDetails save(OrderDetails orderDetails);

    OrderDetails finById(Integer id);

    void deleteOrderDetailsByProductId(Integer productId);

    void deleteOrderDetailByIdOrder(String orderId);
}
