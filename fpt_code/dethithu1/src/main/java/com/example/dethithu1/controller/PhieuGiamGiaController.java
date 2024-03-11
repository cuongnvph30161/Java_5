package com.example.dethithu1.controller;

import com.example.dethithu1.entity.KhachHang;
import com.example.dethithu1.entity.PhieuGiamGia;
import com.example.dethithu1.service.KhachHangService;
import com.example.dethithu1.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaService phieuGiamGiaService;
    @Autowired
    private KhachHangService khachHangService;
    private List<KhachHang> listKhachHang;
    private PhieuGiamGia thePhieuGiamGia;

    @GetMapping("/phieu-giam-gia/hien-thi")
    public String listPhieuGiamGia(Model model, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        Page<PhieuGiamGia> pageOfPhieuGiamGia = phieuGiamGiaService.getAllPhanTrang(pageNo);
        listKhachHang = khachHangService.getAll();
        model.addAttribute("listMaKhachHang", listKhachHang);
        model.addAttribute("phieuMaGiams", pageOfPhieuGiamGia);
        model.addAttribute("totalPage", pageOfPhieuGiamGia.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        return "/phieugiamgia/index";
    }

    @GetMapping("/phieu-giam-gia/delete")
    public String deletePhieuGiamGiaById(@RequestParam("id") String id) {
        phieuGiamGiaService.deleteById(id);
        return "redirect:/phieu-giam-gia/hien-thi";
    }

    @GetMapping("/phieu-giam-gia/update")
    public String detailPhieuGiamGia(@RequestParam("id") String id, Model model) {

        thePhieuGiamGia = phieuGiamGiaService.finById(id);
        model.addAttribute("phieuGiamGia", thePhieuGiamGia);

        listKhachHang = khachHangService.getAll();
        model.addAttribute("listMaKhachHang", listKhachHang);
        return "/phieugiamgia/update";
    }

    @PostMapping("/phieu-giam-gia/add")
    public String addPhieuGiamGia(@ModelAttribute("phieuGiamGia") PhieuGiamGia phieuGiamGia, Model model) {

        boolean flag = false;
        if (phieuGiamGia.getTenPhieu().equals("") || phieuGiamGia.getTenPhieu().trim().isEmpty()) {
            model.addAttribute("errorTenPhieu", "Không được rỗng tên phiếu");
            flag = true;
        }
        if (phieuGiamGia.getGiaTriGiam() == null) {
            model.addAttribute("errorGiaTriGiam", "Không được rỗng giá trị giảm");
            flag = true;
        }
        if (phieuGiamGia.getGiaTriGiamToiDa() == null) {
            model.addAttribute("errorGiaTriGiamToiDa", "Không được rỗng giá trị giảm tối đa");
            flag = true;
        }

        if (phieuGiamGia.getNgayKetThuc().compareTo(phieuGiamGia.getNgayBatDau()) < 0) {
            model.addAttribute("errorNgayBatDau", "Ngày kết thúc phải lớn hơn ngày bắt đầu");
            flag = true;
        }

        if (flag) {
            model.addAttribute("phieuGiamGia", phieuGiamGia);
            model.addAttribute("listMaKhachHang", listKhachHang);
            return "/phieugiamgia/update";
        }

        phieuGiamGiaService.save(phieuGiamGia);
        return "redirect:/phieu-giam-gia/hien-thi";
    }

    @GetMapping("/search")
    public String searchByMaKhachHang(@RequestParam("id") Integer id, Model model) {
        List<PhieuGiamGia> listSearchPhieuGiamGia = phieuGiamGiaService.listSearchPhieuGiamGia(id);
        if(listSearchPhieuGiamGia==null|| listSearchPhieuGiamGia.isEmpty()){
            return "redirect:/phieu-giam-gia/hien-thi";
        }else{
            listKhachHang = khachHangService.getAll();
            model.addAttribute("listMaKhachHang", listKhachHang);
            model.addAttribute("phieuMaGiams", listSearchPhieuGiamGia);
            return "/phieugiamgia/index";
        }

    }
}
