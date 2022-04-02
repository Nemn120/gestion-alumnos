package com.fchavez.app.gestionbackend.application.rest;

import com.fchavez.app.gestionbackend.application.response.GenericResponse;
import com.fchavez.app.gestionbackend.domain.TeacherDTO;
import com.fchavez.app.gestionbackend.domain.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/v1/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> findById(@PathVariable("id") @NotNull Integer id) {
        GenericResponse<TeacherDTO> response = new GenericResponse();
        response.setData(teacherService.findById(id));
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GenericResponse>  findAll() {
        GenericResponse response = new GenericResponse();
        response.setData(teacherService.findAll());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody  @Valid TeacherDTO teacher) {
        GenericResponse response = new GenericResponse();
        response.setData(teacherService.add(teacher));
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<GenericResponse> update(@RequestBody @Valid TeacherDTO teacher) {
        GenericResponse response = new GenericResponse();
        response.setData(teacherService.update(teacher));
        response.setStatus(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") @NotNull Integer id) {
        teacherService.deleteById(id);
        GenericResponse response = new GenericResponse();
        response.setMessage("Recurso eliminado","Registro fue eliminado",HttpStatus.OK);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }
}
