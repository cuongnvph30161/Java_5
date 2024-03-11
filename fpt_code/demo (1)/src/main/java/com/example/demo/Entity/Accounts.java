package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Accounts")
public class Accounts {
    @Id
    private String userName;
//    @Column(name = "password")
//    private String passWord;
//    private String fullName;
//    private String email;
//    @Column(name="photo")
//    private Integer activated;
//    private Integer admin;
}
