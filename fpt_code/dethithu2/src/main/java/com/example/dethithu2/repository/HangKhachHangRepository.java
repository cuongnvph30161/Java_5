package com.example.dethithu2.repository;

import com.example.dethithu2.entity.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang,Integer> {

}
