package com.example.dethithu2.service;

import com.example.dethithu2.entity.KhachHang;
import com.example.dethithu2.repository.KhachHangRepository;
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
    public void deleteById(Integer maKhachHang) {
        khachHangRepository.deleteById(maKhachHang);
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang finById(Integer id) {
        return khachHangRepository.findById(id).get();
    }

    @Override
    public List<KhachHang> search(String sdt) {
        return khachHangRepository.searchKhachHangByTenAndSdt(sdt);
    }


}
