package com.example.thijava5.service;

import com.example.thijava5.entity.HangKhachHang;
import com.example.thijava5.repository.HangKhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangKhachHangImpl implements HangKhachHangService{
    @Autowired
    private HangKhachHangRepository hangKhachHangRepository;
    @Override
    public List<HangKhachHang> getAll() {
        return hangKhachHangRepository.findAll();
    }
}
