package com.fchavez.app.gestionbackend.domain.service.impl;

import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.domain.repository.StudentRepository;
import com.fchavez.app.gestionbackend.domain.service.StudentService;

import java.time.LocalDateTime;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTO add(StudentDTO studentDTO) {
        studentDTO.setRegistrationDate(LocalDateTime.now());
        return studentRepository.add(studentDTO);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        return studentRepository.update(studentDTO);
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDTO findById(Integer studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public List<StudentDTO> findByIdTeacher(Integer idTeacher) {
        return studentRepository.findByIdTeacher(idTeacher);
    }
}
