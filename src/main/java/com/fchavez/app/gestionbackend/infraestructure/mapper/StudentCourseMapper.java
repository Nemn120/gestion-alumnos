package com.fchavez.app.gestionbackend.infraestructure.mapper;

import com.fchavez.app.gestionbackend.domain.StudentCourseDTO;
import com.fchavez.app.gestionbackend.infraestructure.entity.StudentCourse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentCourseMapper {

    StudentCourseMapper INSTANCE = Mappers.getMapper(StudentCourseMapper.class);

    StudentCourse mapIn(StudentCourseDTO studentCourse);
    StudentCourseDTO mapOut(StudentCourse studentCourse);
}
