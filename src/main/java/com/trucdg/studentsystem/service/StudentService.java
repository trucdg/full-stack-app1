package com.trucdg.studentsystem.service;

import com.trucdg.studentsystem.model.Student;
import jakarta.persistence.Entity;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
