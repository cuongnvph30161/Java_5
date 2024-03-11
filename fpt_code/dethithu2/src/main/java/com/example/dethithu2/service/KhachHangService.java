package com.example.dethithu2.service;

import com.example.dethithu2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface KhachHangService {
    Page<KhachHang> getAllPhanTrang(Integer pageNo);

    void deleteById(Integer maKhachHang);

    KhachHang save(KhachHang khachHang);

    KhachHang finById(Integer id);

    List<KhachHang> search (String sdt);

}



