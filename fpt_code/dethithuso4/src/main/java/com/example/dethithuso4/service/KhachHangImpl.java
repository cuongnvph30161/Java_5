package com.example.dethithuso4.service;

import com.example.dethithuso4.entity.KhachHang;
import com.example.dethithuso4.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangImpl implements KhachHangService{
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public Page<KhachHang> getAllPhanTrang(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1,5);
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void deleteById(Integer id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang finById(Integer id) {
        return khachHangRepository.findById(id).get();
    }

    @Override
    public List<KhachHang> search(String tenKH) {
        return khachHangRepository.search(tenKH);
    }
}
