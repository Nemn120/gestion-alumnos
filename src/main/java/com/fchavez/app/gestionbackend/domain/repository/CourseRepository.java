package com.fchavez.app.gestionbackend.domain.repository;

import com.fchavez.app.gestionbackend.domain.CourseDTO;

import java.util.List;

public interface CourseRepository {

    CourseDTO add(CourseDTO CourseDTO);

    void deleteById(Integer id);

    CourseDTO update(CourseDTO CourseDTO);

    List<CourseDTO> findAll();

    CourseDTO findById(Integer CourseId);
}
