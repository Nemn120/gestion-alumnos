package com.fchavez.app.gestionbackend.application.rest;

import com.fchavez.app.gestionbackend.application.response.GenericResponse;
import com.fchavez.app.gestionbackend.domain.StudentDTO;
import com.fchavez.app.gestionbackend.domain.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> findById(@PathVariable("id") @NotNull Integer id) {
        GenericResponse<StudentDTO> response = new GenericResponse();
        response.setData(studentService.findById(id));
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<GenericResponse>  findAll() {
        GenericResponse response = new GenericResponse();
        response.setData(studentService.findAll());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GenericResponse> save(@RequestBody  @Valid StudentDTO student) {
        GenericResponse response = new GenericResponse();
        response.setData(studentService.add(student));
        response.setStatus(HttpStatus.CREATED);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<GenericResponse> update(@RequestBody @Valid StudentDTO student) {
        GenericResponse response = new GenericResponse();
        response.setData(studentService.update(student));
        response.setStatus(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse> delete(@PathVariable("id") @NotNull Integer id) {
        studentService.deleteById(id);
        GenericResponse response = new GenericResponse();
        response.setMessage("Recurso eliminado","Registro fue eliminado",HttpStatus.OK);
        return new ResponseEntity<>(response, response.getMessage().getCode());
    }

    @GetMapping("/teacher")
    public ResponseEntity<GenericResponse> findByIdTeacher(@RequestParam("id_teacher") @NotNull Integer idTeacher) {
        GenericResponse<List<StudentDTO>> response = new GenericResponse();
        response.setData(studentService.findByIdTeacher(idTeacher));
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
