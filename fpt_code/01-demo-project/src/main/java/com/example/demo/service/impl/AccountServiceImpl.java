package com.example.demo.service.impl;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account finById(String username) {
        Optional<Account> result = accountRepository.findById(username);

        Account theAccount = null;

        if (result.isPresent()) {
            theAccount = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + username);
        }

        return theAccount;
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void update(Account account) {
       accountRepository.save(account);
    }

    @Override
    public void deleteById(String username) {
           accountRepository.deleteById(username);
    }
}
