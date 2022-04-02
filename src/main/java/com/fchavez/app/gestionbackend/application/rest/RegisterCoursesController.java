package com.fchavez.app.gestionbackend.application.rest;

import com.fchavez.app.gestionbackend.application.response.GenericResponse;
import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.domain.request.RegisterCoursesRq;
import com.fchavez.app.gestionbackend.domain.service.RegisterCoursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register-courses")
public class RegisterCoursesController {

    private RegisterCoursesService registerCoursesService;

    public RegisterCoursesController(RegisterCoursesService registerCoursesService) {
        this.registerCoursesService = registerCoursesService;
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody RegisterCoursesRq registerCoursesRq) {
        GenericResponse response = new GenericResponse();
        response.setData(registerCoursesService.register(registerCoursesRq));
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

}
