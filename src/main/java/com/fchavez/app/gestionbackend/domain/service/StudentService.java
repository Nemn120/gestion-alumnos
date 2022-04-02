package com.fchavez.app.gestionbackend.domain.service;

import com.fchavez.app.gestionbackend.domain.StudentDTO;

import java.util.List;

public interface StudentService {

    StudentDTO add(StudentDTO studentDTO);

    void deleteById(Integer id);

    StudentDTO update(StudentDTO studentDTO);

    List<StudentDTO> findAll();

    StudentDTO findById(Integer studentId);

    List<StudentDTO> findByIdTeacher(Integer idTeacher);
}
