package com.example.demo.Service;

import com.example.demo.Entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    List<OrderDetail> getAll();
    void delete(Integer id);
    OrderDetail detail(Integer id);
    void add(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
}
