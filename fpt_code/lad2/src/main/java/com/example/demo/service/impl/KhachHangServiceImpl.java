package com.example.demo.service.impl;

import com.example.demo.entity.KhachHang;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
        return null;
    }

    @Override
    public KhachHang finById(Integer id) {
        return null;
    }

    @Override
    public void update(KhachHang khachHang) {

    }

    @Override
    public void delete(Integer id) {

    }
}
