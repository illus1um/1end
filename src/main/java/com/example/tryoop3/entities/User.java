package com.example.tryoop3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name  = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    private String surname;

    private String email;

    private String password;
    public User(String name, String surname, String email, String password) {
        setEmail(email);
        setName(name);
        setSurname(surname);
        setPassword(password);
    }
}