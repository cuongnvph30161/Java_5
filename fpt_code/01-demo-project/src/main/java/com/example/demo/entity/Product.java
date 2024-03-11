package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "names")
    private String name;
    @Column(name = "images")
    private String images;
    @Column(name = "create_date")
    private Date createDate;

    private Double price;

    @Column(name = "available")
    private Integer avaliable;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
}
