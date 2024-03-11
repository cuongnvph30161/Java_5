package com.example.dethithu1.service.Impl;

import com.example.dethithu1.entity.PhieuGiamGia;
import com.example.dethithu1.repository.PhieuGiamGiaRepository;
import com.example.dethithu1.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaImpl implements PhieuGiamGiaService {
    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;

    @Override
    public Page<PhieuGiamGia> getAllPhanTrang(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1,5);
        return this.phieuGiamGiaRepository.findAll(pageable);
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

    @Override
    public List<PhieuGiamGia> listSearchPhieuGiamGia(Integer maKhachHang) {
        return phieuGiamGiaRepository.searchPhieuGiamGiaByMaKhachHang(maKhachHang);
    }
}
