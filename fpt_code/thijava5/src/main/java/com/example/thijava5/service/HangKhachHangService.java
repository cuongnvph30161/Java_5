package com.example.thijava5.service;

import com.example.thijava5.entity.HangKhachHang;
import com.example.thijava5.repository.HangKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface HangKhachHangService {
    List<HangKhachHang> getAll();
}
