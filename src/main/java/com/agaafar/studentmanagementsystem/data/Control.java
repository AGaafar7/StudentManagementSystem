package com.agaafar.studentmanagementsystem.data;

import java.util.ArrayList;

public class Control<E> {
    private ArrayList<E> dataList;

    public Control(){
        this.dataList = new ArrayList<>();
    }

    public void create(E object){
        this.dataList.add(object);
    }

    public ArrayList<E> read(){
        return this.dataList;
    }

    public void update(int id, E newObject) {
        //TODO: Implement Update
        System.out.println("Data not found. Check your information.");
    }

    public void delete(int id) {
        //TODO: Implement Delete
        System.out.println("Data not found. Please check your information.");
    }
    public void setStudentsList(ArrayList<E> studentsList){
        this.dataList = studentsList;
    }

    public ArrayList<Student> getStudentsList(){
        return (ArrayList<Student>) dataList;
    }

    public void setInstructorList(ArrayList<E> instructorList){
        this.dataList = instructorList;
    }

    public ArrayList<Instructor> getInstructorList(){
        return (ArrayList<Instructor>) dataList;
    }

    public void setGradesList(ArrayList<E> gradesList){
        this.dataList = gradesList;
    }

    public ArrayList<Grade> getGradesList(){
        return (ArrayList<Grade>) dataList;
    }

    public void setCourseList (ArrayList<E> courseList){
        this.dataList = courseList;
    }

    public ArrayList<Course> getCourseList(){
        return (ArrayList<Course>) dataList;
    }


}
