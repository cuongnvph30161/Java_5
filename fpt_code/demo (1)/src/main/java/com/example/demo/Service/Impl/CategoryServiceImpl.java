package com.example.demo.Service.Impl;

import com.example.demo.Entity.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category detail(Integer id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void update(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }
}
