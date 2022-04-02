package com.fchavez.app.gestionbackend.infraestructure.mapper;

import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.infraestructure.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student mapIn(StudentDTO studentDTO);
    StudentDTO mapOut(Student student);
    List<StudentDTO> mapOutList(List<Student> students);
}
