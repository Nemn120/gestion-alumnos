package com.fchavez.app.gestionbackend.domain.request;

import com.fchavez.app.gestionbackend.domain.RegisterCoursesDTO;

import java.util.List;

public class RegisterCoursesRq {

    private Integer idStudent;

    List<RegisterCoursesDTO> registerCourses;

    public List<RegisterCoursesDTO> getRegisterCourses() {
        return registerCourses;
    }

    public void setRegisterCourses(List<RegisterCoursesDTO> registerCourses) {
        this.registerCourses = registerCourses;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }
}
