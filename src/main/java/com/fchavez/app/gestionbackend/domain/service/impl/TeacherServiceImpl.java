package com.fchavez.app.gestionbackend.domain.service.impl;

import com.fchavez.app.gestionbackend.domain.TeacherDTO;
import com.fchavez.app.gestionbackend.domain.repository.TeacherRepository;
import com.fchavez.app.gestionbackend.domain.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public TeacherDTO add(TeacherDTO teacherDTO) {
        return teacherRepository.add(teacherDTO);
    }

    @Override
    public void deleteById(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        return teacherRepository.update(teacherDTO);
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public TeacherDTO findById(Integer teacherId) {
        return teacherRepository.findById(teacherId);
    }
}
