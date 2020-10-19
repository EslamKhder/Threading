package com.company.model;

import java.sql.Time;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Time date;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, Time date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }
}
