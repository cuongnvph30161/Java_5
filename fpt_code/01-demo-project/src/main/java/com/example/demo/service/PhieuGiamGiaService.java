package com.example.demo.service;

import com.example.demo.entity.PhieuGiamGia;

import java.util.List;

public interface PhieuGiamGiaService {
    List<PhieuGiamGia> getAll();
    PhieuGiamGia finById(String maPhieu);
    void deleteById(String maPhieu);
    PhieuGiamGia save(PhieuGiamGia phieuGiamGia);
}
