package com.company.Controller;

import com.company.model.Student;
import com.company.services.StudentServiceImbl;

import java.util.ArrayList;
import java.util.List;

public class StudentController implements Runnable {
    private StudentServiceImbl studentServiceImbl = new StudentServiceImbl();
    private Student student = new Student();

    public StudentController() {
    }

    public StudentController(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return this.studentServiceImbl.getStudents();
    }
    public Student editStudents() {
        return this.studentServiceImbl.editStudents(student);
    }

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            this.editStudents();
    }
}
