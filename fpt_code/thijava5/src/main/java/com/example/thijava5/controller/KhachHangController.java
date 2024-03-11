package com.example.thijava5.controller;

import com.example.thijava5.entity.HangKhachHang;
import com.example.thijava5.entity.KhachHang;
import com.example.thijava5.repository.KhachHangRepository;
import com.example.thijava5.service.HangKhachHangService;
import com.example.thijava5.service.KhachHangService;
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
    public String hienthi(Model model, @RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo){
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang",khachHang);
        listHangKhachHang = hangKhachHangService.getAll();
        model.addAttribute("listHangKhachHang",listHangKhachHang);


        Page<KhachHang> pageOfKhachHang = khachHangService.getAllPhanTrang(pageNo);
        model.addAttribute("pageOfKhachHang",pageOfKhachHang);
        model.addAttribute("totalPage",pageOfKhachHang.getTotalPages());
        model.addAttribute("currenPage",pageNo);
        return "index";
    }

    @PostMapping("/khach-hang/add")
    public String add(@ModelAttribute("khachHang") KhachHang khachHang){
       khachHangService.save(khachHang);
       return "redirect:/khach-hang/hien-thi";
    }
    @GetMapping("/khach-hang/delete")
    public String deleteById(@RequestParam("id") String id){
        khachHangService.deleteById(id);
        return "redirect:/khach-hang/hien-thi";
    }
//    @GetMapping("/khach-hang/search")
//    public String search(@RequestParam("key") String key, Model model){
//        System.out.println("key"+key);
//       List<KhachHang> searchList= khachHangService.search(key);
//       if(searchList.isEmpty()){
//           model.addAttribute("pageOfKhachHang",)
//       }
//        model.addAttribute("pageOfKhachHang",searchList);
//
//
//
//        model.addAttribute("listHangKhachHang",listHangKhachHang);
//
//        return "index";
//    }
}
