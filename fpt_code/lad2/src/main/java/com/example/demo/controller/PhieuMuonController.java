package com.example.demo.controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.PhieuMuon;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.PhieuMuonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PhieuMuonController {
    @Autowired
    private PhieuMuonService phieuMuonService;
    @Autowired
    private KhachHangService khachHangService;
    private List<KhachHang> listKhachHang;

    @GetMapping("/hien-thi-phieu")
    public String getAll(Model model) {
        List<PhieuMuon> getList = phieuMuonService.getAll();
        model.addAttribute("phieumuons", getList);
        PhieuMuon phieuMuon = new PhieuMuon();
        model.addAttribute("phieumuon", phieuMuon);

        listKhachHang = khachHangService.getAll();
        model.addAttribute("listNameKhachHang", listKhachHang);
        return "phieumuon";
    }

    @PostMapping("/save-phieu")
    public String savePhieuMuon(@ModelAttribute("phieumuon") PhieuMuon phieuMuon) {
        phieuMuonService.save(phieuMuon);
        return "redirect:/hien-thi-phieu";
    }

    @GetMapping("/delete-phieu")
    public String deletePhieu(@RequestParam("id") Integer id) {
        phieuMuonService.delete(id);
        System.out.println("logggggggg" + id);
        return "redirect:/hien-thi-phieu";
    }
}
