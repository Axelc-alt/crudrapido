package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tls_teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long teacherId;
    @Column(name = "email_adress",unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String profession;
    private String firstName;
    private String lastName;
}
