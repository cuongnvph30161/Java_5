package com.example.demo.Service;

import com.example.demo.Entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    void delete(Integer id);

    Category detail(Integer id);

    void update(Category category);

    void add(Category category);
}
