package com.example.dethithuso4.controller;

import com.example.dethithuso4.entity.HangKhachHang;
import com.example.dethithuso4.entity.KhachHang;
import com.example.dethithuso4.service.HangKhachHangService;
import com.example.dethithuso4.service.KhachHangService;
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
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private HangKhachHangService hangKhachHangService;

    private List<HangKhachHang> listHangKhachHang;

    @GetMapping("/khach-hang/hien-thi")
    public String hienthi(Model model, @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo) {

        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);

        listHangKhachHang = hangKhachHangService.getAll();
        model.addAttribute("listHangKhachHang", listHangKhachHang);

        Page<KhachHang> pageOfKhachHang = khachHangService.getAllPhanTrang(pageNo);
        model.addAttribute("pageOfKhachHang", pageOfKhachHang);
        model.addAttribute("totalPage", pageOfKhachHang.getTotalPages());
        model.addAttribute("currenPage", pageNo);
        return "hien-thi";
    }

    @PostMapping("/khach-hang/add")
    public String add(@ModelAttribute("khachHang") KhachHang khachHang, Model model) {
        khachHangService.save(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/khach-hang/delete")
    public String delete(@RequestParam("id") Integer id) {
        khachHangService.deleteById(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/khach-hang/detail")
    public String detail(@RequestParam("id") Integer id, Model model) {
        KhachHang khachHang = khachHangService.finById(id);
        model.addAttribute("khachHang", khachHang);
        model.addAttribute("listHangKhachHang", listHangKhachHang);
        return "details";
    }

    @GetMapping("/khach-hang/search")
    public String search(@RequestParam("id") String id, Model model) {
        List<KhachHang> searchKH = khachHangService.search(id);
        System.out.println("log search"+" "+searchKH);
        if (searchKH==null||searchKH.isEmpty()) {
            return "redirect:/khach-hang/hien-thi";
        } else {
            model.addAttribute("pageOfKhachHang", searchKH);
            KhachHang khachHang = new KhachHang();
            model.addAttribute("khachHang", khachHang);
            model.addAttribute("listHangKhachHang", listHangKhachHang);
            return "hien-thi";
        }
    }

}
