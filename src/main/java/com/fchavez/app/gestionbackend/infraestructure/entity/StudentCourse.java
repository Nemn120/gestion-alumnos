package com.fchavez.app.gestionbackend.infraestructure.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "STUDENT_COURSE")
@Data
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudentCourse;

    @Column(nullable = false, name = "registration_date")
    private LocalDateTime registrationDate;

    @ManyToOne
    @JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_student"))
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_teacher", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_teacher"))
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_course", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_course"))
    private Course course;

    @Column(nullable = false, name = "cicle")
    private Integer cicle;
}
