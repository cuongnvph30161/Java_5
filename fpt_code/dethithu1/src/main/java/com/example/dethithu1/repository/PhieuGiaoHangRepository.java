package com.example.dethithu1.repository;

import com.example.dethithu1.entity.PhieuGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PhieuGiaoHangRepository extends JpaRepository<PhieuGiaoHang, UUID> {
}
