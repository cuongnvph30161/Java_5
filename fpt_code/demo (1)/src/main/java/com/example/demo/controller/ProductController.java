package com.example.demo.controller;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.ViewModel.ProductsViewModel;
import com.example.demo.Repository.ProductViewModelRepo;
import com.example.demo.Repository.ProductsRepository;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.Impl.ProductServiceImpl;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/product/hien-thi")
    String hienThi(Model model){
        List<Product> productsViewModelList = productService.getAll();
        List<Category> categories = categoryService.getAll();

        model.addAttribute("products", productsViewModelList);
        model.addAttribute("categories", categories);
        return "/product";
    }

    @PostMapping("/product/addNew")
    String addNew(@RequestParam("name") String name,
                  @RequestParam("images") String images,
                  @RequestParam("available") Integer available,
                  @RequestParam("price") Long price,
                  @RequestParam("categories") Category categories
                  ){
        Product product = new Product();
        product.setName(name);
        product.setImages(images);
        product.setAvailable(available);
        product.setPrice(price);
        product.setCategories(categories);

        productService.insert(product);
        return "redirect:/product/hien-thi";
    }

    @GetMapping("/product/delete/{id}")
    String delete(@PathVariable("id") Integer id){
        productService.delete(id);
        return "redirect:/product/hien-thi";
    }

    @GetMapping("/product/detail/{id}")
    String detail(Model model,
            @PathVariable("id") Integer id){
        Product product = productService.detail(id);
        List<Category> categories = categoryService.getAll();
        model.addAttribute("product",product);
        model.addAttribute("categories", categories);
        return "product-detail";
    }

    @PostMapping("/product/update/{id}")
    String updateProduct(@PathVariable("id") Integer id,
                         @RequestParam("name") String name,
                  @RequestParam("images") String images,
                  @RequestParam("available") Integer available,
                  @RequestParam("price") Long price,
                  @RequestParam("categories") Category categories
    ){
        Product product = new Product();
        product.setName(name);
        product.setImages(images);
        product.setAvailable(available);
        product.setPrice(price);
        product.setCategories(categories);

        productService.update(product);
        return "redirect:/product/hien-thi";
    }
}
