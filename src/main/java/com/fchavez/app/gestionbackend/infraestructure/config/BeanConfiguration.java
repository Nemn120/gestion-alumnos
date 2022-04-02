package com.fchavez.app.gestionbackend.infraestructure.config;

import com.fchavez.app.gestionbackend.GestionBackendApplication;
import com.fchavez.app.gestionbackend.domain.service.CourseService;
import com.fchavez.app.gestionbackend.domain.service.RegisterCoursesService;
import com.fchavez.app.gestionbackend.domain.service.StudentService;
import com.fchavez.app.gestionbackend.domain.service.TeacherService;
import com.fchavez.app.gestionbackend.domain.service.impl.CourseServiceImpl;
import com.fchavez.app.gestionbackend.domain.service.impl.RegisterCoursesServiceImpl;
import com.fchavez.app.gestionbackend.domain.service.impl.StudentServiceImpl;
import com.fchavez.app.gestionbackend.domain.service.impl.TeacherServiceImpl;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.CourseRepositoryH2;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.StudentCourseRepositoryH2;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.StudentRepositoryH2;
import com.fchavez.app.gestionbackend.infraestructure.repository.h2.TeacherRepositoryH2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = GestionBackendApplication.class)
public class BeanConfiguration {

    @Bean
    StudentService studentService(StudentRepositoryH2 repository) {
        return new StudentServiceImpl(repository);
    }

    @Bean
    TeacherService teacherService(TeacherRepositoryH2 repository) {
        return new TeacherServiceImpl(repository);
    }

    @Bean
    CourseService courseService(CourseRepositoryH2 repository) {
        return new CourseServiceImpl(repository);
    }

    @Bean
    RegisterCoursesService registerCoursesService(StudentCourseRepositoryH2 repository) {
        return new RegisterCoursesServiceImpl(repository);
    }
}
