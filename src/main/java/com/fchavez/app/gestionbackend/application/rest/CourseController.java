package com.fchavez.app.gestionbackend.application.rest;

import com.fchavez.app.gestionbackend.application.response.GenericResponse;
import com.fchavez.app.gestionbackend.domain.CourseDTO;
import com.fchavez.app.gestionbackend.domain.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/v1/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> findById(@PathVariable("id") @NotNull Integer id) {
        GenericResponse<CourseDTO> response = new GenericResponse();
        response.setData(courseService.findById(id));
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GenericResponse>  findAll() {
        GenericResponse response = new GenericResponse();
        response.setData(courseService.findAll());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody @Valid CourseDTO course) {
        GenericResponse response = new GenericResponse();
        response.setData(courseService.add(course));
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<GenericResponse> update(@RequestBody @Valid CourseDTO course) {
        GenericResponse response = new GenericResponse();
        response.setData(courseService.update(course));
        response.setStatus(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") @NotNull Integer id) {
        courseService.deleteById(id);
        GenericResponse response = new GenericResponse();
        response.setMessage("Recurso eliminado","Registro fue eliminado",HttpStatus.OK);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }
}
