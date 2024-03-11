package com.example.demo.repository;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.PhieuMuon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuMuonRepository extends JpaRepository<PhieuMuon,Integer> {
}
