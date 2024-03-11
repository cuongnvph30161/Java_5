package com.example.dethithu1.service;

import com.example.dethithu1.entity.PhieuGiaoHang;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface PhieuGiaoHangService {
    Page<PhieuGiaoHang> getAllPhanTrang(Integer pageNo);
     void deletePhieuGiaoHangById(UUID maPhieuGiaoHang);
     PhieuGiaoHang save(PhieuGiaoHang phieuGiaoHang);
}
