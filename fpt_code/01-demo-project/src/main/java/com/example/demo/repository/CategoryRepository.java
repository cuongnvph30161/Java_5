package com.example.demo.repository;

import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
@Query("SELECT c.id FROM Category c WHERE c.name=:name")
// @Param là người vận chuyển bieens đó tới :name  nên tên trong @Param phải khớp với :name
  Integer finIdByName(@Param("name") String name);
}
