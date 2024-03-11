package com.example.demo.service.impl;

import com.example.demo.entity.OrderDetails;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public List<OrderDetails> getAll() {
        return orderDetailsRepository.findAll();
    }

    @Override
    public OrderDetails save(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public OrderDetails finById(Integer id) {
        return orderDetailsRepository.findById(id).get();
    }

    @Override
    public void deleteOrderDetailsByProductId(Integer productId) {
        orderDetailsRepository.deleteOrderDetailsByProductId(productId);
    }

    @Override
    public void deleteOrderDetailByIdOrder(String orderId) {
        orderDetailsRepository.deleteOrderDetailByIdOrder(orderId);
    }

//    @Override
//    public void deleleById(Integer id) {
//         orderDetailsRepository.deleteById(id);
//    }

}
