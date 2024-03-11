package com.example.dethithuso4.repository;

import com.example.dethithuso4.entity.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang, Integer> {
}
