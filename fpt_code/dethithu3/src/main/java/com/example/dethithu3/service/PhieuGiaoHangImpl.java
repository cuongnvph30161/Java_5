package com.example.dethithu3.service;

import com.example.dethithu3.entity.PhieuGiaoHang;
import com.example.dethithu3.repository.PhieuGiaoHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiaoHangImpl implements PhieuGiaoHangService{
    @Autowired
    private PhieuGiaoHangRepository phieuGiaoHangRepository;
    @Override
    public Page<PhieuGiaoHang> getAllPhanTrang(Integer pageNo) {
        Pageable  pageable = PageRequest.of(pageNo-1,5);
        return phieuGiaoHangRepository.findAll(pageable);
    }
}
