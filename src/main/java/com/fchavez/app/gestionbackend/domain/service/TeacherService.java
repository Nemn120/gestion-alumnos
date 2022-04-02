package com.fchavez.app.gestionbackend.domain.service;

import com.fchavez.app.gestionbackend.domain.TeacherDTO;

import java.util.List;

public interface TeacherService {

    TeacherDTO add(TeacherDTO teacherDTO);

    void deleteById(Integer id);

    TeacherDTO update(TeacherDTO teacherDTO);

    List<TeacherDTO> findAll();

    TeacherDTO findById(Integer teacherId);
}
