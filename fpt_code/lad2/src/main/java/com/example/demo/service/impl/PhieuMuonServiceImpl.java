package com.example.demo.service.impl;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.PhieuMuon;
import com.example.demo.repository.PhieuMuonRepository;
import com.example.demo.service.PhieuMuonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhieuMuonServiceImpl implements PhieuMuonService {
    @Autowired
    private PhieuMuonRepository phieuMuonRepository;


    @Override
    public List<PhieuMuon> getAll() {
        return phieuMuonRepository.findAll();
    }

    @Override
    public PhieuMuon save(PhieuMuon phieuMuon) {
        return phieuMuonRepository.save(phieuMuon);
    }

    @Override
    public PhieuMuon finById(Integer id) {
        return phieuMuonRepository.findById(id).get();
    }

    @Override
    public void update(PhieuMuon phieuMuon) {

    }

    @Override
    public void delete(Integer id) {
       phieuMuonRepository.deleteById(id);
    }
}
