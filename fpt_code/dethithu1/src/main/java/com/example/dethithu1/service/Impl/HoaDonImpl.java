package com.example.dethithu1.service.Impl;

import com.example.dethithu1.entity.HoaDon;
import com.example.dethithu1.repository.HoaDonRepository;
import com.example.dethithu1.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonImpl implements HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepository;
    @Override
    public List<HoaDon> getAll() {

        return hoaDonRepository.findAll();
    }
}
