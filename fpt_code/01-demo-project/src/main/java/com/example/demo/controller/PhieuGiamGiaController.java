package com.example.demo.controller;

import com.example.demo.entity.PhieuGiamGia;
import com.example.demo.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaService phieuGiamGiaService;
    @GetMapping("/hien-thi")
    public String listPhieuGiamGia(Model model){
        List<PhieuGiamGia> listPhieuMaGiam = phieuGiamGiaService.getAll();
        System.out.println("logggg"+" "+listPhieuMaGiam);
        model.addAttribute("phieuMaGiams",listPhieuMaGiam);
        return "index";

    }
}
