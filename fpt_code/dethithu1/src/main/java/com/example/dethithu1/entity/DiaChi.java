package com.example.dethithu1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "diachi")
public class DiaChi {
    @Column(name = "madiachi")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maDiaChi;
    @Column(name = "tendiachi")
    private String tenDiaChi;

}
