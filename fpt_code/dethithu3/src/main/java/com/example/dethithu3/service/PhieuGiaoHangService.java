package com.example.dethithu3.service;

import com.example.dethithu3.entity.PhieuGiaoHang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhieuGiaoHangService {
    Page<PhieuGiaoHang> getAllPhanTrang(Integer pageNo);
}
