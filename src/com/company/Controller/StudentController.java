package com.company.Controller;

import com.company.model.Student;
import com.company.services.StudentServiceImbl;

import java.util.ArrayList;
import java.util.List;

public class StudentController implements Runnable {
    private StudentServiceImbl studentServiceImbl = new StudentServiceImbl();

    public StudentController() {
    }

    public List<Student> getStudents() {
        return this.studentServiceImbl.getStudents();
    }
    public Student editStudents(Student student) {
        return this.studentServiceImbl.editStudents(student);
    }

    @Override
    public synchronized void run() {
        List<Student> students = this.getStudents();
        for (int x = 0;x<students.size();x++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.editStudents(students.get(x));
        }
    }
}
