package com.company;

import com.company.Controller.StudentController;
import com.company.dao.DatabaseConnection;
import com.company.model.Student;
import com.company.services.StudentServiceImbl;

import java.sql.SQLException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here
        /*StudentServiceImbl s = new StudentServiceImbl();
        for(Student student : s.getStudents()){
            System.out.println(student.getDate());
        }
        StudentController studentControl = new StudentController();
        List<Student> students = studentControl.getStudents();
*/
        StudentController studentController = new StudentController();
        Thread thread = new Thread(studentController);
        thread.start();
        /*for (int i =0;i<students.size();i++){
            StudentController studentController = new StudentController(students.get(i));
            Thread thread = new Thread(studentController);
            thread.run();
        }*/

    }
}