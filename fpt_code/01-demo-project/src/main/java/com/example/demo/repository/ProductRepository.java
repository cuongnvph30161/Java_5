package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAll(Pageable pageable);

    @Query(value = "select * from products\n" +
            "where id=?", nativeQuery = true)
    Product getProductsById(Integer id);

    @Transactional
    @Modifying
    @Query(value = "delete from products where category = ?", nativeQuery = true)
    void deleteProductsByCategoryId(Integer id);

    @Query(value = "select id from products where category=?", nativeQuery = true)
    ArrayList<Integer> getProductIdByCategoryId(Integer id);

    @Query(value = "\n" +
            "select * from products\n" +
            "where names like '%?%'", nativeQuery = true)
    ArrayList<Product> searchProduct(String name);
}
