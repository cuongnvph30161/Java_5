package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.Order;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountService accountService;
    private List<Account> listAccount;

    @GetMapping("/list-order")
    public String getAll(Model model) {
//        gửi dữ liệu sang bên hiển thị
        List<Order> getList = orderService.getAll();
        model.addAttribute("orders", getList);
        // Tạo đối tượng rỗng để thêm và update
        Order order = new Order();
        model.addAttribute("order", order);
        // tạo list name account select option
        listAccount = accountService.getAll();
        model.addAttribute("listAccount", listAccount);

        return "/order/order";

    }

    @PostMapping("/add-order")
    public String addOrder(@ModelAttribute("order") Order order) {
        orderService.save(order);
        return "redirect:/list-order";
    }

    @GetMapping("/update-order")
    public String update(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("order", orderService.finById(id));
        model.addAttribute("listAccount", listAccount);
        return "/order/detail";
    }

    @GetMapping("/delete-order")
    public String delete(@RequestParam("id") Integer id) {
        orderService.delete(id);
        return "redirect:/list-order";
    }

}
