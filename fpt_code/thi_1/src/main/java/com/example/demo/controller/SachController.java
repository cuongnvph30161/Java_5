package com.example.demo.controller;

import com.example.demo.entity.Sach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SachController {
    List<Sach> listSach = new ArrayList<>();
    List<String> listLoaiSach = new ArrayList<>();

    public SachController() {
        Sach sach = new Sach(1, "Max", "Otto", "@mde", 10);
        listSach.add(sach);
        listLoaiSach.add("Otto");
        listLoaiSach.add("HHH");
        listLoaiSach.add("KKK");
    }

    @GetMapping("/hien-thi-sach")
    public String hienThiSach(Model model) {
        model.addAttribute("sach", listSach);
        model.addAttribute("listLoaiSach", listLoaiSach);
        return "sach";
    }

    @GetMapping("/detail-sach")
    String detail(Model model,
                  @RequestParam("id") Integer id) {
        Sach sach = new Sach();
        for (Sach sach1 : listSach) {
            if (id.equals(sach1.getId())) {
                sach = sach1;
            }
        }
        model.addAttribute("sach", sach);
        model.addAttribute("listLoai", listLoaiSach);
        return "detail";
    }

    @PostMapping("/update-sach")
    public String updateSach(
            @RequestParam("id") Integer id,
            @RequestParam("ten") String ten,
            @RequestParam("loai") String loai,
            @RequestParam("tacgia") String tacGia,
            @RequestParam("gia") Integer gia
    ) {
        for (Sach sach : listSach) {
         if(id.equals(sach.getId())){
             sach.setGia(gia);
             sach.setLoai(loai);
             sach.setTen(ten);
             sach.setTacGia(tacGia);
         }
        }
        return "redirect:/hien-thi-sach";
    }

    @PostMapping("/add-sach")
    public String addSach(
            @RequestParam("id") Integer id,
            @RequestParam("ten") String ten,
            @RequestParam("loai") String loai,
            @RequestParam("tacgia") String tacgia,
            @RequestParam("gia") long gia
    ) {
        Sach sach = new Sach(id, ten, loai, tacgia, gia);
        listSach.add(sach);
        return "redirect:/hien-thi-sach";
    }

    @GetMapping("/delete-sach")
    String delete(@RequestParam("id") Integer id) {
        Sach sach = new Sach();
        for (Sach sach1 : listSach) {
            if (sach1.getId() == id) {
                sach = sach1;
            }
        }
        listSach.remove(sach);
        return "redirect:/hien-thi-sach";
    }
}
