package com.agaafar.studentmanagementsystem.data;

import java.util.ArrayList;

public class Instructor {
    private int id ;
    private String instructorName;
    private ArrayList<Course> courses;

    public void setId(int id) {
        this.id = id;
    }

    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }

    public String getInstructorName(){
        return instructorName;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
