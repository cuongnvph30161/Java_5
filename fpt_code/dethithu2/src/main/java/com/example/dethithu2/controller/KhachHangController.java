package com.example.dethithu2.controller;

import com.example.dethithu2.entity.HangKhachHang;
import com.example.dethithu2.entity.KhachHang;
import com.example.dethithu2.repository.KhachHangRepository;
import com.example.dethithu2.service.HangKhachHangService;
import com.example.dethithu2.service.KhachHangService;
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
    public String hienthi(Model model, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);
        listHangKhachHang = hangKhachHangService.getAll();
        model.addAttribute("listHangKhachHang", listHangKhachHang);


        Page<KhachHang> pageOfKhachHang = khachHangService.getAllPhanTrang(pageNo);
        model.addAttribute("listKhachHang", pageOfKhachHang);
        model.addAttribute("totalPage", pageOfKhachHang.getTotalPages());
        model.addAttribute("currenPage", pageNo);
        return "hienthi";
    }

    @GetMapping("/khach-hang/delete")
    public String delete(@RequestParam("id") Integer id) {
        khachHangService.deleteById(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @PostMapping("/khach-hang/add")
    public String add(@ModelAttribute("khachHang") KhachHang khachHang, Model model) {
        khachHangService.save(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/khach-hang/detail")
    public String detail(Integer id, Model model) {
        KhachHang khachHang = khachHangService.finById(id);
        System.out.println("log ngay sinh" + " " + khachHang.getSinhNhat());
        model.addAttribute("listHangKhachHang", listHangKhachHang);
        model.addAttribute("khachHang", khachHang);
        return "detail";
    }

    @GetMapping("/khach-hang/search")
    public String search(@RequestParam("sdt") String sdt, Model model) {

        System.out.println("log sdt"+" "+sdt);
        List<KhachHang> listSearch = khachHangService.search(sdt);
        if(listSearch.isEmpty()){
            return "redirect:/khach-hang/hien-thi";
        }
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);
        model.addAttribute("listHangKhachHang", listHangKhachHang);
        model.addAttribute("listKhachHang", listSearch);
        return "hienthi";
    }
}
