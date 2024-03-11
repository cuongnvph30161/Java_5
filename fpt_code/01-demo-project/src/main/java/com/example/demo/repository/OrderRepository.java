package com.example.demo.repository;

import com.example.demo.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Transactional
    @Modifying
    @Query(value = "delete from orders where username = ?", nativeQuery = true)
    void deleteOrderByUsername(String username);

}
