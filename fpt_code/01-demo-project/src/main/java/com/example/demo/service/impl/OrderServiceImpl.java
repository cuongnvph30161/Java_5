package com.example.demo.service.impl;

import com.example.demo.entity.Account;
import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order finById(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void deleteOrderByUsername(String username) {
        orderRepository.deleteOrderByUsername(username);
    }

}
