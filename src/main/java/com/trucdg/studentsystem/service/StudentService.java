package com.trucdg.studentsystem.service;

import com.trucdg.studentsystem.model.Student;
import jakarta.persistence.Entity;

public interface StudentService {
    public Student saveStudent(Student student);
}
