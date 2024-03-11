package com.example.dethithu1.service.Impl;

import com.example.dethithu1.entity.DiaChi;
import com.example.dethithu1.repository.DiaChiRepository;
import com.example.dethithu1.service.DiaChiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaChiImpl implements DiaChiService {
    @Autowired
    private DiaChiRepository diaChiRepository;
    @Override
    public List<DiaChi> getAll() {
        return diaChiRepository.findAll();
    }
}
