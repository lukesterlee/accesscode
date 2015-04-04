package com.c4q.davisroman;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by davis on 4/4/15.
 */
public class Teacher {
    private String name;
    private ArrayList<Student> students;

    public Teacher(String name){
        this.name = name;
        students = new ArrayList<Student>();
    }
    public String getName(){
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
