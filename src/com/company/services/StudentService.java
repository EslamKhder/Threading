package com.company.services;

import com.company.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    public Student editStudents(Student student);
}
