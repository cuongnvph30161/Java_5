package com.example.demo.Service.Impl;

import com.example.demo.Entity.Orders;
import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Override
    public List<Orders> getAll() {
        return ordersRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        ordersRepository.deleteById(id);
    }

    @Override
    public Orders detail(Integer id) {
        return ordersRepository.findById(id).get();
    }
    @Override
    public void insert(Orders orders) {
        ordersRepository.save(orders);
    }

    @Override
    public void update(Orders orders) {
        ordersRepository.save(orders);
    }
}
