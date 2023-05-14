package com.example.mongo_db_course.repository;

import com.example.mongo_db_course.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
