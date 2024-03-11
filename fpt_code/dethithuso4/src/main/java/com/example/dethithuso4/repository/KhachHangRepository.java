package com.example.dethithuso4.repository;

import com.example.dethithuso4.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
    @Query(value = "SELECT * FROM KhachHang WHERE tenKhachHang =?", nativeQuery = true)
    List<KhachHang> search(String tenKH);



}
