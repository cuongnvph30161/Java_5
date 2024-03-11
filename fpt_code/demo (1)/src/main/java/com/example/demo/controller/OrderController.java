package com.example.demo.controller;

import com.example.demo.Entity.Accounts;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.AccountRepository;
import com.example.demo.Service.OrderService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/order/hien-thi")
    String hienThiOrder(Model model){
        List<Orders> ordersList = orderService.getAll();
        List<Accounts> accountsList = accountRepository.findAll();
        model.addAttribute("account", accountsList);
        model.addAttribute("listOrder", ordersList);

        return "order";
    }

    @PostMapping("/order/addNew")
    String addNew(@RequestParam("account") Accounts accounts,
                  @RequestParam("createDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date createDate,
                  @RequestParam("address") String address
                  ){
        Orders orders = new Orders();
        orders.setAccounts(accounts);
        orders.setCreateDate(createDate);
        orders.setAddress(address);
        orderService.insert(orders);
        return "redirect:/order/hien-thi";
    }

    @GetMapping("/order/delete/{id}")
    String delete(@PathVariable("id") Integer id){
        orderService.delete(id);
        return "redirect:/order/hien-thi";
    }

    @GetMapping("/order/detail/{id}")
    String detail(Model model,
                  @PathVariable("id") Integer id){
        Orders orders = orderService.detail(id);
        List<Accounts> accountsList = accountRepository.findAll();
        model.addAttribute("order",orders);
        model.addAttribute("account", accountsList);
        return "order_detail";
    }

    @PostMapping("/order/update/{id}")
    String update(@PathVariable("id") Integer id,
            @RequestParam("accounts") Accounts accounts,
                  @RequestParam("createDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date createDate,
                  @RequestParam("address") String address
    ){
        Orders orders = new Orders(id,accounts,createDate,address);
        orderService.update(orders);
        return "redirect:/order/hien-thi";
    }
}
