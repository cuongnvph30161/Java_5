package com.example.demo.service.impl;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> getAllPhanTrang(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo - 1, 3); // số trang bắt đầu từ 0
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> searchProductPhanTrang(String keyword, Integer pageNo) {
        List list = this.searchProduct(keyword);
        Pageable pageable = PageRequest.of(pageNo - 1, 2);
        Integer start = (int)pageable.getOffset();
        return new PageImpl<Product>(list, pageable, list.size());
    }

    @Override
    public ArrayList<Product> searchProduct(String name) {
        return productRepository.searchProduct(name);
    }

    @Override
    public Product finById(Integer id) {
        Optional<Product> result = productRepository.findById(id);

        Product theProduct = null;

        if (result.isPresent()) {
            theProduct = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + id);
        }

        return theProduct;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Integer finIdByNameCategory(String name) {
        return categoryRepository.finIdByName(name);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.getProductsById(id);
    }

    @Override
    public void deleteProductsByCategoryId(Integer id) {
        productRepository.deleteProductsByCategoryId(id);
    }

    @Override
    public ArrayList<Integer> getProductIdByCategoryId(Integer id) {
        return productRepository.getProductIdByCategoryId(id);
    }
}
