package com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa;

import com.fchavez.app.gestionbackend.infraestructure.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositoryJPA extends JpaRepository<Student,Integer> {

    @Query("SELECT DISTINCT s FROM StudentCourse sc JOIN sc.student s  JOIN sc.teacher t where t.idTeacher=:idTeacher")
    List<Student> findByTeacherId(@Param("idTeacher") Integer id);


}
