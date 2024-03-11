package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import com.example.demo.service.OrderDetailsService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    // dependencty: là 1 interface vì thế không thể khởi tạo đối tượng trực tiếp
    // cách hoạt động của @Autowired: sẽ tự động tạo 1 Object categoryService và injcet vào đối tượng CategoryController
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/category/hien-thi")
    public String getAll(Model model) {
        List<Category> list = categoryService.getAll();
        model.addAttribute("categorys", list);
        Category category = new Category();
        model.addAttribute("category", category);
//        list.forEach(category-> System.out.printf(category.toString()));
        return "/categories/category";
    }

    @Transactional
    @PostMapping("/add/category")
    public String showFormForAdd(@ModelAttribute("category") Category category) {

        categoryService.save(category);
        return "redirect:/category/hien-thi";
    }

    @Transactional
    @GetMapping("/detail-category")
    public String detailCategory(@RequestParam("id") Integer id, Model model) {
        Category theCategory = categoryService.finById(id);
        model.addAttribute("category", theCategory);
        return "/categories/detail";
    }

    @GetMapping("/delete-category")
    public String delete(@RequestParam("id") Integer theId) {

        orderDetailsService.deleteOrderDetailsByProductId(theId);
        productService.deleteProductsByCategoryId(theId);
        categoryService.deleteById(theId);
        return "redirect:/category/hien-thi";
    }
}
