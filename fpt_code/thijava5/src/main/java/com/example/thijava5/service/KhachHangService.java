package com.example.thijava5.service;

import com.example.thijava5.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface KhachHangService {
    Page<KhachHang> getAllPhanTrang(Integer pageNo);
    void deleteById(String sdt);

    KhachHang save(KhachHang khachHang);

    List<KhachHang> search(String key);
}
