package com.fchavez.app.gestionbackend.infraestructure.mapper;

import com.fchavez.app.gestionbackend.domain.TeacherDTO;
import com.fchavez.app.gestionbackend.infraestructure.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TeacherMapper {

    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    Teacher mapIn(TeacherDTO TeacherDTO);
    TeacherDTO mapOut(Teacher Teacher);
    List<TeacherDTO> mapOutList(List<Teacher> Teachers);
}
