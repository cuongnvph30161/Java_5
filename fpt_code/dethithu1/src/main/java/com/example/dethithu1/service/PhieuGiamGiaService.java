package com.example.dethithu1.service;

import com.example.dethithu1.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhieuGiamGiaService {
    Page<PhieuGiamGia> getAllPhanTrang(Integer pageNo);

    PhieuGiamGia finById(String maPhieu);

    void deleteById(String maPhieu);

    PhieuGiamGia save(PhieuGiamGia phieuGiamGia);

    List<PhieuGiamGia> listSearchPhieuGiamGia(Integer maKhachHang);
}
