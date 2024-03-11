package com.example.demo.Service.Impl;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductsRepository;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsRepository productsRepository;
    @Override
    public List<Product> getAll() {
        return productsRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Product detail(Integer id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public void insert(Product product) {
        productsRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productsRepository.save(product);
    }
}
