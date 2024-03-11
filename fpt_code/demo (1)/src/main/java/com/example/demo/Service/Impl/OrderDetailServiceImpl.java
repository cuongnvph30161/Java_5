package com.example.demo.Service.Impl;

import com.example.demo.Entity.OrderDetail;
import com.example.demo.Repository.OrderDetailsRepo;
import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Service.OrderDetailService;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Override
    public List<OrderDetail> getAll() {
        return orderDetailsRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        orderDetailsRepo.deleteById(id);
    }

    @Override
    public OrderDetail detail(Integer id) {
        return orderDetailsRepo.findById(id).get();
    }

    @Override
    public void add(OrderDetail orderDetail) {
        orderDetailsRepo.save(orderDetail);
    }

    @Override
    public void update(OrderDetail orderDetail) {
        orderDetailsRepo.save(orderDetail);
    }
}
