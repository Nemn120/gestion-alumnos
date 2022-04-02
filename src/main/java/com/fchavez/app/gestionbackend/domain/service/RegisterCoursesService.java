package com.fchavez.app.gestionbackend.domain.service;

import com.fchavez.app.gestionbackend.domain.StudentCourseDTO;
import com.fchavez.app.gestionbackend.domain.request.RegisterCoursesRq;

import java.util.List;

public interface RegisterCoursesService {

    List<StudentCourseDTO> register(RegisterCoursesRq registerCoursesRq);

}
