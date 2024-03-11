package com.example.dethithu3.controller;

import com.example.dethithu3.entity.PhieuGiaoHang;
import com.example.dethithu3.service.PhieuGiaoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhieuGiaoHangController {
    @Autowired
    private PhieuGiaoHangService phieuGiaoHangService;

    @GetMapping("/phieu-giao-hang/hien-thi")
    public String hienthi(Model  model, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo){



        Page<PhieuGiaoHang> pageOfPhieuGiaoHang = phieuGiaoHangService.getAllPhanTrang(pageNo);
        model.addAttribute("pageOfPhieuGiaoHang",pageOfPhieuGiaoHang);
        model.addAttribute("totalPage",pageOfPhieuGiaoHang.getTotalPages());
        model.addAttribute("currenPage",pageNo);
        return"hien-thi";



    }
}
