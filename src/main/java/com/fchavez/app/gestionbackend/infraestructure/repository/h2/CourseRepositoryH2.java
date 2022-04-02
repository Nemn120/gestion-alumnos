package com.fchavez.app.gestionbackend.infraestructure.repository.h2;

import com.fchavez.app.gestionbackend.domain.CourseDTO;
import com.fchavez.app.gestionbackend.domain.repository.CourseRepository;
import com.fchavez.app.gestionbackend.infraestructure.mapper.CourseMapper;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa.CourseRepositoryJPA;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseRepositoryH2 implements CourseRepository {
    

    private CourseRepositoryJPA repository;

    public CourseRepositoryH2(CourseRepositoryJPA repository) {
        this.repository = repository;
    }

    @Override
    public CourseDTO add(CourseDTO courseDTO) {
        return CourseMapper.INSTANCE.mapOut(repository.save(CourseMapper.INSTANCE.mapIn(courseDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        if(!repository.existsById(id))
            return;
        repository.deleteById(id);
    }

    @Override
    public CourseDTO update(CourseDTO courseDTO) {
        if(!repository.existsById(courseDTO.getIdCourse()))
            return null;
        return CourseMapper.INSTANCE.mapOut(CourseMapper.INSTANCE.mapIn(courseDTO));
    }

    @Override
    public List<CourseDTO> findAll() {
        return CourseMapper.INSTANCE.mapOutList(repository.findAll());
    }

    @Override
    public CourseDTO findById(Integer CourseId) {
        return CourseMapper.INSTANCE.mapOut(repository.findById(CourseId).orElseThrow(
                ()-> new RuntimeException("Error al encontrar Recurso")
        ));
    }
}
