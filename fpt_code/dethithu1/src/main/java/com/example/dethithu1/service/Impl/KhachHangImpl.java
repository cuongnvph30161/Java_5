package com.example.dethithu1.service.Impl;

import com.example.dethithu1.entity.KhachHang;
import com.example.dethithu1.repository.KhachHangRepository;
import com.example.dethithu1.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KhachHangImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }


}
