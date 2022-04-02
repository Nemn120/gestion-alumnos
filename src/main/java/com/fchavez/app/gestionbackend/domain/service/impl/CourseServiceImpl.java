package com.fchavez.app.gestionbackend.domain.service.impl;

import com.fchavez.app.gestionbackend.domain.CourseDTO;
import com.fchavez.app.gestionbackend.domain.repository.CourseRepository;
import com.fchavez.app.gestionbackend.domain.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDTO add(CourseDTO courseDTO) {
        return courseRepository.add(courseDTO);
    }

    @Override
    public void deleteById(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseDTO update(CourseDTO courseDTO) {
        return courseRepository.update(courseDTO);
    }

    @Override
    public List<CourseDTO> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public CourseDTO findById(Integer courseId) {
        return courseRepository.findById(courseId);
    }
}
