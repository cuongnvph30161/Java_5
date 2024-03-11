package com.example.demo.service;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category save(Category category);
    Category finById(Integer id);
    void deleteById(Integer id);

}
