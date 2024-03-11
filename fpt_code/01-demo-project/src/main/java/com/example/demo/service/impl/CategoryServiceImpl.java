package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

@Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category finById(Integer id) {
        Optional<Category> result = categoryRepository.findById(id);

        Category theCategory = null;

        if (result.isPresent()) {
            theCategory = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return theCategory;
    }

    @Override
    public void deleteById(Integer id) {
         categoryRepository.deleteById(id);
    }

}
