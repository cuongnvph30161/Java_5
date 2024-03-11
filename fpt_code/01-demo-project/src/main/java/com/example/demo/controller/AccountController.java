package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.Category;
import com.example.demo.service.AccountService;
import com.example.demo.service.OrderDetailsService;
import com.example.demo.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    private List<Account> theAccount;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/list-account")
    public String listAccount(Model model) {
        theAccount = accountService.getAll();
        model.addAttribute("accounts", theAccount);
        Account account = new Account();
        model.addAttribute("account", account);
        return "/account/account";
    }

    @PostMapping("/add/account")
    public String showFormForAdd(@ModelAttribute("account") Account account, BindingResult bindingResult, Model model) {
        if (account.getUsername() == null || account.getUsername().trim().isEmpty()) {
            model.addAttribute("message", "Username cannot be empty");
            model.addAttribute("accounts", accountService.getAll());
            return "/account/account";
        } else {
            accountService.save(account);
        }
        return "redirect:/list-account";
    }

    @GetMapping("/detail/account")
    public String detail(@RequestParam("id") String id, Model model) {
        Account account = accountService.finById(id);
        model.addAttribute("account", account);
        return "/account/detail";
    }

    @GetMapping("/delete/account")
    public String delete(@RequestParam("id") String id) {
        orderDetailsService.deleteOrderDetailByIdOrder(id);
        orderService.deleteOrderByUsername(id);
        accountService.deleteById(id);
        return "redirect:/list-account";
    }


}
