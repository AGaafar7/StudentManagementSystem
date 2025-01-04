package com.agaafar.studentmanagementsystem.data;

import java.util.Map;

public class Student {
    private String name;
    private int registrationId;
    private Map<Course, Grade> courseGrade;

    public Student(){}

    public Student(String name, int registrationId) {
        this.name = name;
        this.registrationId = registrationId;
    }
    public Student(String name, int registrationId, Map<Course, Grade> courseGrade) {
        this.name = name;
        this.registrationId = registrationId;
        this.courseGrade = courseGrade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
    public int getRegistrationId() {
        return registrationId;
    }
    public void setCourseGrade(Map<Course, Grade> courseGrade) {
        this.courseGrade = courseGrade;
    }
    public Map<Course, Grade> getCourseGrade() {
        return courseGrade;
    }
}
