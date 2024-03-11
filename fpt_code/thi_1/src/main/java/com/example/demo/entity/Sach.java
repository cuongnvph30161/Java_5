package com.example.demo.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Sach {
    @NotNull(message = "không được rỗng")
    private int id;
    private String ten;
    private String loai;
    private String tacGia;
    private long gia;

}
