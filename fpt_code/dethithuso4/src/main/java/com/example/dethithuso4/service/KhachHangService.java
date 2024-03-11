package com.example.dethithuso4.service;

import com.example.dethithuso4.entity.KhachHang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface KhachHangService {
    Page<KhachHang> getAllPhanTrang(Integer pageNo);
    KhachHang save(KhachHang khachHang);

    void deleteById(Integer id);

    KhachHang finById(Integer id);
    List<KhachHang> search(String tenKH);
}
