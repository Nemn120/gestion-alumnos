package com.fchavez.app.gestionbackend.infraestructure.repository.h2;

import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.domain.repository.StudentRepository;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa.StudentRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import static com.fchavez.app.gestionbackend.infraestructure.mapper.StudentMapper.INSTANCE;

@Component
public class StudentRepositoryH2 implements StudentRepository {

    private StudentRepositoryJPA repository;

    @Autowired
    public StudentRepositoryH2(StudentRepositoryJPA repository) {
        this.repository = repository;
    }

    @Override
    public StudentDTO add(StudentDTO studentDTO) {
        return INSTANCE.mapOut(
                repository.save(INSTANCE.mapIn(studentDTO)));
    }

    @Override
    public void deleteById(Integer id) {
        if(!repository.existsById(id)){
            return;
        }
        repository.deleteById(id);
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        if(!repository.existsById(studentDTO.getIdStudent())){
           return null;
        }
        return INSTANCE.mapOut(repository.save(INSTANCE.mapIn(studentDTO)));
    }

    @Override
    public List<StudentDTO> findAll() {
        return INSTANCE.mapOutList(repository.findAll());
    }

    @Override
    public StudentDTO findById(Integer studentId) {
        return INSTANCE.mapOut(repository.findById(studentId).orElseThrow(
                ()-> new RuntimeException("Error al encontrar Recurso")
        ));
    }

    @Override
    public List<StudentDTO> findByIdTeacher(Integer idTeacher) {
        return INSTANCE.mapOutList(repository.findByTeacherId(idTeacher));
    }
}
