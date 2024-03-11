package com.example.demo.Repository;

import com.example.demo.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, String> {
}
