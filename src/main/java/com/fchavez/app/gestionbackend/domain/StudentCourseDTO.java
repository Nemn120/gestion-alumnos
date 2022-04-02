package com.fchavez.app.gestionbackend.domain;

import java.time.LocalDateTime;

public class StudentCourseDTO {

    private Integer idStudentCourse;

    private LocalDateTime registrationDate;

    private StudentDTO student;

    private TeacherDTO teacher;

    private CourseDTO course;

    private Integer cicle;

    public Integer getIdStudentCourse() {
        return idStudentCourse;
    }

    public void setIdStudentCourse(Integer idStudentCourse) {
        this.idStudentCourse = idStudentCourse;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDTO teacher) {
        this.teacher = teacher;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    public Integer getCicle() {
        return cicle;
    }

    public void setCicle(Integer cicle) {
        this.cicle = cicle;
    }
}
