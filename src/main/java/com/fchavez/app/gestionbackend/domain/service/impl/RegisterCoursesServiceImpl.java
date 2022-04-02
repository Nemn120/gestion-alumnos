package com.fchavez.app.gestionbackend.domain.service.impl;

import com.fchavez.app.gestionbackend.domain.RegisterCoursesDTO;
import com.fchavez.app.gestionbackend.domain.StudentCourseDTO;
import com.fchavez.app.gestionbackend.domain.mapper.StudentCourseCustomMapper;
import com.fchavez.app.gestionbackend.domain.repository.StudentCourseRepository;
import com.fchavez.app.gestionbackend.domain.request.RegisterCoursesRq;
import com.fchavez.app.gestionbackend.domain.service.RegisterCoursesService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class RegisterCoursesServiceImpl implements RegisterCoursesService {

    StudentCourseRepository studentCourseRepository;

    public RegisterCoursesServiceImpl(StudentCourseRepository studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    @Transactional
    @Override
    public List<StudentCourseDTO> register(RegisterCoursesRq registerCoursesRq) {
        return registerCoursesRq.getRegisterCourses().stream().map(
            x -> studentCourseRepository.register(mapIn(x, registerCoursesRq.getIdStudent()))).collect(Collectors.toList());
    }

    private StudentCourseDTO mapIn(RegisterCoursesDTO registerCoursesDTO, Integer idStudent) {
        return StudentCourseCustomMapper.gestInstance().mapIn(registerCoursesDTO, idStudent);
    }
}
