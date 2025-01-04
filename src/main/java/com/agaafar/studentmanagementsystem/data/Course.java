package com.agaafar.studentmanagementsystem.data;

public class Course {
    private final int courseId;
    private final String courseName;
    private Instructor instructorInfo;

    public Course(int courseId, String courseName, Instructor instructorInfo) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorInfo = instructorInfo;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructorInfo() {
        return instructorInfo;
    }


}
