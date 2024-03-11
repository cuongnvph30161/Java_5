package com.example.demo.controller;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/category/hien-thi")
    String hienThi(Model model){
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "/category";
    }

    @PostMapping("/category/addNew")
    String addNew(@RequestParam("name") String name
    ){
        Category category = new Category();
        category.setName(name);
        categoryService.add(category);
        return "redirect:/category/hien-thi";
    }

    @GetMapping("/category/delete/{id}")
    String delete(@PathVariable("id") Integer id){
        categoryService.delete(id);
        return "redirect:/category/hien-thi";
    }

    @GetMapping("/category/detail/{id}")
    String detail(Model model,
                  @PathVariable("id") Integer id){
        Category category = categoryService.detail(id);
        model.addAttribute("category",category);
        return "category_detail";
    }

    @PostMapping("/category/update/{id}")
    String updateProduct(@PathVariable("id") Integer id,
                         @RequestParam("name") String name
    ){
        Category category = new Category(id,name);
        categoryService.update(category);
        return "redirect:/category/hien-thi";
    }
}
