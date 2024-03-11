package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Page<Product> getAllPhanTrang(Integer pageNo);
    Page<Product> searchProductPhanTrang(String keyword,Integer pageNo);
    ArrayList<Product> searchProduct(String name);
    Product finById(Integer id);

    Product save(Product product);

    void delete(Integer id);
    Integer finIdByNameCategory(String name);
    Product getProductById(Integer id);
    void deleteProductsByCategoryId(Integer id);
    ArrayList<Integer> getProductIdByCategoryId(Integer id);
}
