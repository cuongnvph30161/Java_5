package com.example.dethithu3.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "diachi")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "madiachi")
    private UUID maDiaChi;
    @Column(name = "tendiachi")
    private String tenDiaChi;

}
