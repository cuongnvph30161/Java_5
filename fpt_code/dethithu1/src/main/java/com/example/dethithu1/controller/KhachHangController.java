package com.example.dethithu1.controller;

import com.example.dethithu1.entity.KhachHang;
import com.example.dethithu1.entity.PhieuGiamGia;
import com.example.dethithu1.service.KhachHangService;
import com.example.dethithu1.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/hien-thi/khachhang")
    public String listKhachHang(Model model){
        List<KhachHang> listKhachHang = khachHangService.getAll();
        model.addAttribute("khachhang",listKhachHang);
        return "khachhang/index";

    }
}
