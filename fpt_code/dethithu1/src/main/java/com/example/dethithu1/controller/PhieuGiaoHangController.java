package com.example.dethithu1.controller;

import com.example.dethithu1.entity.DiaChi;
import com.example.dethithu1.entity.HoaDon;
import com.example.dethithu1.entity.PhieuGiaoHang;
import com.example.dethithu1.service.DiaChiService;
import com.example.dethithu1.service.HoaDonService;
import com.example.dethithu1.service.PhieuGiaoHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class PhieuGiaoHangController {
    @Autowired
    private PhieuGiaoHangService phieuGiaoHangService;
    @Autowired
    private HoaDonService hoaDonService;
    @Autowired
    private DiaChiService diaChiService;

    @GetMapping("/phieu-giao-hang/hien-thi")
    public String hienthi(Model model, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        PhieuGiaoHang phieuGiaoHang = new PhieuGiaoHang();
        model.addAttribute("phieuGiaoHang", phieuGiaoHang);
        Page<PhieuGiaoHang> pageOfPhieuGiaoHang = phieuGiaoHangService.getAllPhanTrang(pageNo);
        List<DiaChi> listMaDiaChi = diaChiService.getAll();
        List<HoaDon> listMaHoaDon = hoaDonService.getAll();
        model.addAttribute("listMaDiaChi", listMaDiaChi);
        model.addAttribute("listMaHoaDon", listMaHoaDon);

        model.addAttribute("phieuGiaoHangs", pageOfPhieuGiaoHang);
        model.addAttribute("totalPage", pageOfPhieuGiaoHang.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        return "/phieugiaohang/hienthi";

    }

    @PostMapping("/phieu-giao-hang/add")
    public String addPhieuGiaoHang(@Valid @ModelAttribute("phieuGiaoHang")  PhieuGiaoHang phieuGiaoHang,Model model,@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        boolean flag = false;
        if (phieuGiaoHang.getNguoiNhan().equals("") || phieuGiaoHang.getNguoiNhan().trim().isEmpty()) {
            model.addAttribute("errorNguoiNhan", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getNguoiGiao().trim().isEmpty()) {
            model.addAttribute("errorNguoiGiao", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getNgayGiao() == null) {
            model.addAttribute("errorNgayGiao", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getNgayNhan() == null) {
            model.addAttribute("errorNgayNhan", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getSdtNguoiNhan().trim().isEmpty()) {
            model.addAttribute("errorSdtNguoiNhan", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getSdtNguoiGiao().trim().isEmpty()) {
            model.addAttribute("errorNguoiGiao", "Không được rỗng");
            flag = true;
        }

        if (phieuGiaoHang.getPhiGiaoHang() == null) {
            model.addAttribute("errorPhiGiaoHang", "Không được rỗng");
            flag = true;
        }

        if (flag) {

            Page<PhieuGiaoHang> pageOfPhieuGiaoHang = phieuGiaoHangService.getAllPhanTrang(pageNo);
            List<DiaChi> listMaDiaChi = diaChiService.getAll();
            List<HoaDon> listMaHoaDon = hoaDonService.getAll();
            model.addAttribute("listMaDiaChi", listMaDiaChi);
            model.addAttribute("listMaHoaDon", listMaHoaDon);

            model.addAttribute("phieuGiaoHangs", pageOfPhieuGiaoHang);
            model.addAttribute("totalPage", pageOfPhieuGiaoHang.getTotalPages());
            model.addAttribute("currentPage", pageNo);
            return "forward:/phieu-giao-hang/hien-thi";
        } else {
            phieuGiaoHangService.save(phieuGiaoHang);
        }
        return "redirect:/phieu-giao-hang/hien-thi";
    }

    @GetMapping("/phieu-giao-hang/delete")
    private String deletePhieuGiaoHang(@RequestParam("id") UUID maPhieuGiao) {
        phieuGiaoHangService.deletePhieuGiaoHangById(maPhieuGiao);
        return "redirect:/phieu-giao-hang/hien-thi";
    }


}
