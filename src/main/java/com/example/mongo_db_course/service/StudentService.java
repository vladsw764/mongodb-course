package com.example.mongo_db_course.service;

import com.example.mongo_db_course.model.Student;
import com.example.mongo_db_course.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email)
                .orElseThrow(() -> new RuntimeException("student with email " + email + " not found"));
    }

    public String createStudent(Student student) {
        Student s = studentRepository.save(student);
        return s.getId();
    }

}
