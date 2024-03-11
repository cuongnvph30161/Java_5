package com.example.thijava5.repository;

import com.example.thijava5.entity.HangKhachHang;
import com.example.thijava5.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang,Integer> {
}
