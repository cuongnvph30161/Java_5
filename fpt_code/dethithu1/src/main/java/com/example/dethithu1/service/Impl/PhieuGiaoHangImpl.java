package com.example.dethithu1.service.Impl;

import com.example.dethithu1.entity.PhieuGiamGia;
import com.example.dethithu1.entity.PhieuGiaoHang;
import com.example.dethithu1.repository.PhieuGiaoHangRepository;
import com.example.dethithu1.service.PhieuGiamGiaService;
import com.example.dethithu1.service.PhieuGiaoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PhieuGiaoHangImpl implements PhieuGiaoHangService {
    @Autowired
    private PhieuGiaoHangRepository phieuGiaoHangRepository;

    @Override
    public Page<PhieuGiaoHang> getAllPhanTrang(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo - 1, 5);
        return phieuGiaoHangRepository.findAll(pageable);
    }

    @Override
    public void deletePhieuGiaoHangById(UUID maPhieuGiaoHang) {
        phieuGiaoHangRepository.deleteById(maPhieuGiaoHang);

    }

    @Override
    public PhieuGiaoHang save(PhieuGiaoHang phieuGiaoHang) {
        return phieuGiaoHangRepository.save(phieuGiaoHang);
    }
}
