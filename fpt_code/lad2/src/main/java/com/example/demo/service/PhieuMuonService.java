package com.example.demo.service;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.PhieuMuon;

import java.util.List;

public interface PhieuMuonService {
    List<PhieuMuon> getAll();

    PhieuMuon save(PhieuMuon phieuMuon);

    PhieuMuon finById(Integer id);

    void update(PhieuMuon phieuMuon);

    void delete(Integer id);
}
