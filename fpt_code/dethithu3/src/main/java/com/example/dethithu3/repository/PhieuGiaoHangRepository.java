package com.example.dethithu3.repository;

import com.example.dethithu3.entity.PhieuGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PhieuGiaoHangRepository extends JpaRepository<PhieuGiaoHang, UUID> {

}
