package com.c4q.davisroman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by davis on 4/4/15.
 */
public class Principal {
    private String name;

    private ArrayList<Teacher> teachers;

    public Principal(String name){
        this.name = name;
        teachers = new ArrayList<Teacher>();
    }
    public String getName(){
        return name;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    // Given a color, return the number of students that have this
    // color lunchbox
    public int numOfStudentsWithCertainColorLunchbox(String color){
        int total = 0;

        for (Teacher teacher : teachers) {
            for(Student student : teacher.getStudents()) {
                if (student.getLunchbox().getName().equals(color))
                    total++;
            }

        }
        return total;
    }

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        for (Teacher teacher : teachers) {
            for(Student student : teacher.getStudents()) {
                if (student.getLunchbox().getName().equals(color))
                    System.out.println(student.getName());
            }

        }
    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentname){
        for (Teacher teacher : teachers) {
            for(Student student : teacher.getStudents()) {
                if (student.getName().equals(studentname))
                    return teacher.getName();
            }
        }
        return "new student";
    }

    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        for (Teacher teacher : teachers) {
            for(Student student : teacher.getStudents()) {
                if (student.getNumOfPencilsInPocket() < numOfPencils) {
                    System.out.println(teacher.getName());
                    break;
                }

            }

        }
    }

}
