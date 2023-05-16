package com.example.mongo_db_course.controller;

import com.example.mongo_db_course.model.Student;
import com.example.mongo_db_course.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{email}")
    public ResponseEntity<Student> getStudentByEmail(@PathVariable String email) {
        return new ResponseEntity<>(studentService.getStudentByEmail(email), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        student.setCreated(LocalDateTime.now());
        studentService.createStudent(student);
        return new ResponseEntity<>(student.getId(), HttpStatus.CREATED);
    }
}
