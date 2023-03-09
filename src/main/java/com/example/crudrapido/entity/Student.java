package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tls_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long student_id;
    @Column(name = "email_adress",unique = true,nullable = false)
    private String email;
    private String firstame;
    private String lastName;
}
