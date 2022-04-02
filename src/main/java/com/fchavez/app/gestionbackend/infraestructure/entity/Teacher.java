package com.fchavez.app.gestionbackend.infraestructure.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TEACHER")
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTeacher;

    @Column(length = 20, nullable = false, name = "code")
    private String code;

    @Column(length = 75, nullable = false, name = "name")
    private String name;

    @Column(length = 75, nullable = false, name = "last_name")
    private String lastName;

    @Column(length = 75, nullable = false, name = "email")
    private String email;

    @Column(length = 75, nullable = false, name = "registration_date")
    private LocalDateTime registrationDate;
}
