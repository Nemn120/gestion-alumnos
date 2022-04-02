package com.fchavez.app.gestionbackend.infraestructure.repository.h2.jpa;

import com.fchavez.app.gestionbackend.infraestructure.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositoryJPA extends JpaRepository<Course, Integer> {
}
