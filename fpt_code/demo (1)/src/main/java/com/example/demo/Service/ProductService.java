package com.example.demo.Service;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    void delete(Integer id);
    Product detail(Integer id);
    void  insert(Product product);
    void update(Product product);
}
