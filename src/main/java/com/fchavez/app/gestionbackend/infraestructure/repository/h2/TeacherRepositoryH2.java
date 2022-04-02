package com.fchavez.app.gestionbackend.infraestructure.repository.h2;

import com.fchavez.app.gestionbackend.domain.TeacherDTO;
import com.fchavez.app.gestionbackend.domain.repository.TeacherRepository;
import com.fchavez.app.gestionbackend.infraestructure.mapper.TeacherMapper;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa.TeacherRepositoryJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeacherRepositoryH2 implements TeacherRepository {

    private TeacherRepositoryJPA repository;

    public TeacherRepositoryH2(TeacherRepositoryJPA repository) {
        this.repository = repository;
    }

    @Override
    public TeacherDTO add(TeacherDTO teacherDTO) {
        return TeacherMapper.INSTANCE.mapOut(repository.save(TeacherMapper.INSTANCE.mapIn(teacherDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        if(!repository.existsById(id))
            return;
        repository.deleteById(id);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        if(!repository.existsById(teacherDTO.getIdTeacher()))
            return null;
        return TeacherMapper.INSTANCE.mapOut(TeacherMapper.INSTANCE.mapIn(teacherDTO));
    }

    @Override
    public List<TeacherDTO> findAll() {
        return TeacherMapper.INSTANCE.mapOutList(repository.findAll());
    }

    @Override
    public TeacherDTO findById(Integer teacherId) {
        return TeacherMapper.INSTANCE.mapOut(repository.findById(teacherId).orElseThrow(
                ()-> new RuntimeException("Error al encontrar Recurso")
        ));
    }
}
