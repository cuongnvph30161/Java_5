package com.example.demo.service.impl;

import com.example.demo.entity.PhieuGiamGia;
import com.example.demo.repository.PhieuGiamGiaRepository;
import com.example.demo.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaImpl implements PhieuGiamGiaService {
    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;
    @Override
    public List<PhieuGiamGia> getAll() {
        return phieuGiamGiaRepository.findAll();
    }

    @Override
    public PhieuGiamGia finById(String maPhieu) {
        return phieuGiamGiaRepository.findById(maPhieu).get();
    }

    @Override
    public void deleteById(String maPhieu) {
        phieuGiamGiaRepository.deleteById(maPhieu);
    }

    @Override
    public PhieuGiamGia save(PhieuGiamGia phieuGiamGia) {
        return phieuGiamGiaRepository.save(phieuGiamGia);
    }
}
