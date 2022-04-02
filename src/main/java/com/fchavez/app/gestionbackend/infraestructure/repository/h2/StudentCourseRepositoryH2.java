package com.fchavez.app.gestionbackend.infraestructure.repository.h2;

import com.fchavez.app.gestionbackend.domain.StudentCourseDTO;
import com.fchavez.app.gestionbackend.domain.repository.StudentCourseRepository;
import com.fchavez.app.gestionbackend.infraestructure.entity.StudentCourse;
import com.fchavez.app.gestionbackend.infraestructure.mapper.StudentMapper;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa.StudentCourseRepositoryJPA;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static com.fchavez.app.gestionbackend.infraestructure.mapper.StudentCourseMapper.INSTANCE;

@Component
public class StudentCourseRepositoryH2 implements StudentCourseRepository {

    private StudentCourseRepositoryJPA studentCourseRepository;

    public StudentCourseRepositoryH2(StudentCourseRepositoryJPA studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    @Override
    public StudentCourseDTO register(StudentCourseDTO studentCourseDTO) {
        StudentCourse studentCourse = INSTANCE.mapIn(studentCourseDTO);
        studentCourse.setStudent(StudentMapper.INSTANCE.mapIn(studentCourseDTO.getStudent()));

        studentCourse.setRegistrationDate(LocalDateTime.now());
        return INSTANCE.mapOut(studentCourseRepository.save(studentCourse));
    }
}
