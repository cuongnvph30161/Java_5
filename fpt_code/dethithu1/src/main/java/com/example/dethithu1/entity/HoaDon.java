package com.example.dethithu1.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "hoadon")
public class HoaDon {
    @Column(name = "mahoadon")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHoaDon;
}
