package com.example.demo.Repository;

import com.example.demo.Entity.ViewModel.ProductsViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductViewModelRepo extends JpaRepository<ProductsViewModel, Integer> {

    @Query(value = "SELECT p.id, p.name , p.price, p.create_date, p.available, c.name as category_name\n" +
            "FROM category c INNER JOIN Products p\n" +
            "ON p.category_id = c.id", nativeQuery = true)
    List<ProductsViewModel> getAllProductsViewModel();
}
