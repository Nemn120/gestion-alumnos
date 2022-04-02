package com.fchavez.app.gestionbackend.domain;

public class RegisterCoursesDTO {

    private Integer idCourse;

    private Integer idTeacher;

    private Integer cicle;

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Integer getCicle() {
        return cicle;
    }

    public void setCicle(Integer cicle) {
        this.cicle = cicle;
    }
}
