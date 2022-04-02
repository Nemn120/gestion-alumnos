package com.fchavez.app.gestionbackend.domain.mapper;

import com.fchavez.app.gestionbackend.EntityStubs;
import com.fchavez.app.gestionbackend.domain.RegisterCoursesDTO;
import com.fchavez.app.gestionbackend.domain.StudentCourseDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class StudentCourseCustomMapperTest {

    @Test
    public void mapInTest() throws IOException {
        RegisterCoursesDTO input = EntityStubs.getInstance().getRegisterCoursesDTO();
        Integer idStudent = 100;
        StudentCourseDTO result = StudentCourseCustomMapper.gestInstance().mapIn(input,idStudent);

        assertNotNull(result);
        assertNotNull(result.getStudent());
        assertNotNull(result.getStudent().getIdStudent());
        assertNotNull(result.getCicle());
        assertNotNull(result.getCourse());
        assertNotNull(result.getCourse().getIdCourse());
        assertNotNull(result.getTeacher());
        assertNotNull(result.getTeacher().getIdTeacher());
        assertNull(result.getIdStudentCourse());
        assertNull(result.getRegistrationDate());

        assertEquals(idStudent, result.getStudent().getIdStudent());
        assertEquals(input.getCicle(), result.getCicle());
        assertEquals(input.getIdCourse(), result.getCourse().getIdCourse());
        assertEquals(input.getIdTeacher(), result.getTeacher().getIdTeacher());
    }
}