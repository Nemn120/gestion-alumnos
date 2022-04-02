package com.fchavez.app.gestionbackend.infraestructure.mapper;

import com.fchavez.app.gestionbackend.domain.CourseDTO;
import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.infraestructure.entity.Course;
import com.fchavez.app.gestionbackend.infraestructure.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);
    Course mapIn(CourseDTO studentCourse);
    CourseDTO mapOut(Course student);
    List<CourseDTO> mapOutList(List<Course> students);
}
