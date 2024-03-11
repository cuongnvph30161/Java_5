package com.example.demo.service;

import com.example.demo.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    List<Account> getAll();
    Account finById(String username);
    Account save(Account account);
    void update(Account account);
    void deleteById(String username);

}
