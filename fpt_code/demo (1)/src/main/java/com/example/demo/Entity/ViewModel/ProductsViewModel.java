package com.example.demo.Entity.ViewModel;

import com.example.demo.Entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductsViewModel {

    @Id
    private int id;

    private String name;
    private String images;
    private Date createDate;
    private Long price;
    @Column(name = "available")
    private Integer available;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category categories;
}
