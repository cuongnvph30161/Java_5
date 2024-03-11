package com.example.demo.Entity;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVienViewModel {
    @NotBlank(message = "Khong Duoc de trong")
    private String hoTen;
    @NotBlank(message = "Khong Duoc de trong")
    private String diaChi;
}
