package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @Column(name="username")
    private String username;

    @Column(name="pass_word")
    private String password;

    @Column(name="full_name")
    private String fullname;

    @Column(name="email")
    private String email;

    @Column(name="photo")
    private String photo;

    @Column(name="activated")
    private boolean activated;

    @Column(name="admin")
    private boolean admin;

}
