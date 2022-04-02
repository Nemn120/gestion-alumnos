package com.fchavez.app.gestionbackend.domain.service;

import com.fchavez.app.gestionbackend.domain.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO add(CourseDTO CourseDTO);

    void deleteById(Integer id);

    CourseDTO update(CourseDTO CourseDTO);

    List<CourseDTO> findAll();

    CourseDTO findById(Integer CourseId);
}
