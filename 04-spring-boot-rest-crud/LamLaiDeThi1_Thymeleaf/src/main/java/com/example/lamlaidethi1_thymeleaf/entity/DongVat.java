package com.example.lamlaidethi1_thymeleaf.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Controller;

@NoArgsConstructor
@Controller
@Getter
@Setter
@ToString
public class DongVat {
    private Integer id;
    private String ten ;
    private Integer tuoi;
    private boolean gioiTinh;
    private Double canNang;
    private String khuVuc;

}
