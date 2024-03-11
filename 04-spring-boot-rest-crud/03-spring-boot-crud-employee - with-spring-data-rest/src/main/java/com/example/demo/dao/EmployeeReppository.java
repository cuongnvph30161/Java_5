package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*đặt đường dẫn endpoint*/
@RepositoryRestResource(path = "members")
public interface EmployeeReppository extends JpaRepository<Employee,Integer> {
}
