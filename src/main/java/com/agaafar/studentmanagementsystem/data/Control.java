package com.agaafar.studentmanagementsystem.data;

import java.util.ArrayList;

public class Control<T> {
    private ArrayList<T> dataList;

    public Control(){
        this.dataList = new ArrayList<>();
    }

    public void create(T object){
        this.dataList.add(object);
    }

    public ArrayList<T> read(){
        return this.dataList;
    }

    public void update(int id, T newObject) {
        //TODO: Implement Update
        System.out.println("Data not found. Check your information.");
    }

    public void delete(int id) {
        //TODO: Implement Delete
        System.out.println("Data not found. Please check your information.");
    }
    public void setStudentsList(ArrayList<T> studentsList){
        this.dataList = studentsList;
    }

    public ArrayList<Student> getStudentsList(){
        return (ArrayList<Student>) dataList;
    }

    public void setInstructorList(ArrayList<T> instructorList){
        this.dataList = instructorList;
    }

    public ArrayList<Instructor> getInstructorList(){
        return (ArrayList<Instructor>) dataList;
    }

    public void setGradesList(ArrayList<T> gradesList){
        this.dataList = gradesList;
    }

    public ArrayList<Grade> getGradesList(){
        return (ArrayList<Grade>) dataList;
    }

    public void setCourseList (ArrayList<T> courseList){
        this.dataList = courseList;
    }

    public ArrayList<Course> getCourseList(){
        return (ArrayList<Course>) dataList;
    }


}
