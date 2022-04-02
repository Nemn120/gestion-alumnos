package com.fchavez.app.gestionbackend.domain.mapper;

import com.fchavez.app.gestionbackend.domain.*;

public class StudentCourseCustomMapper {

    private static StudentCourseCustomMapper  instance;

    public static StudentCourseCustomMapper gestInstance(){
        if(instance == null)
            instance = new StudentCourseCustomMapper();
        return instance;
    }

    public StudentCourseDTO mapIn(RegisterCoursesDTO registerCourses, Integer idStudent){
        StudentCourseDTO studentCourse = new StudentCourseDTO();
        studentCourse.setCourse(mapInCourse(registerCourses.getIdCourse()));
        studentCourse.setStudent(mapInStudent(idStudent));
        studentCourse.setTeacher(mapInTeacher(registerCourses.getIdTeacher()));
        studentCourse.setCicle(registerCourses.getCicle());
        return studentCourse;
    }

    private TeacherDTO mapInTeacher(Integer idTeacher) {
        TeacherDTO teacher = new TeacherDTO();
        teacher.setIdTeacher(idTeacher);
        return teacher;
    }

    private StudentDTO mapInStudent(Integer idStudent) {
        StudentDTO student = new StudentDTO();
        student.setIdStudent(idStudent);
        return student;
    }

    private CourseDTO mapInCourse(Integer idCourse) {
        CourseDTO course = new CourseDTO();
        course.setIdCourse(idCourse);
        return course;
    }
}
