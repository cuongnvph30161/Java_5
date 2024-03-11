package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    private List<Category> listNameCategory;
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/hien-thi-product")
    public String getAll(Model model, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {

        Page<Product> pageOfProduct=productService.getAllPhanTrang(pageNo);
        model.addAttribute("list",pageOfProduct);

        model.addAttribute("totalPage",pageOfProduct.getTotalPages());
        model.addAttribute("currentPage",pageNo);


        Product product = new Product();
        model.addAttribute("product", product);
//   truyền list name category sang bên view select option
        listNameCategory = categoryService.getAll();
        model.addAttribute("listNameCategory", listNameCategory);
        return "/product/product";
    }

    @PostMapping("/add-product")
    public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
        Integer idCategory = productService.finIdByNameCategory(product.getCategory().getName());
        Category category = new Category();
        category.setId(idCategory);
        // Gán Category cho Product
        product.setCategory(category);
        productService.save(product);
        System.out.println("logggggggggg" + product);
        return "redirect:/hien-thi-product";
    }

    @GetMapping("/detail-product")
    public String detail(@RequestParam("id") Integer id, Model model) {
        // detail dữ liệu sang bên trang detail
        Product product = productService.finById(id);
        model.addAttribute("product", product);
        model.addAttribute("listNameCategory", listNameCategory);
        return "/product/detail";
    }

    @GetMapping("/delete/product")
    public String delete(@RequestParam("id") Integer id) {
        productService.delete(id);
        return "redirect:/hien-thi-product";
    }
    
}
