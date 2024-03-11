package com.example.demo.service;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.PhieuMuon;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAll();

    KhachHang save(KhachHang khachHang);

    KhachHang finById(Integer id);

    void update(KhachHang khachHang);

    void delete(Integer id);
}
