package com.agaafar.studentmanagementsystem.data;

public class Grade {
    private char grade;

    public Grade(){}
    public Grade(char grade) {}
    public Grade(int id, char grade) {
        this.grade = grade;
    }

    public void setGrade(char value) {
        this.grade = value;
    }

    public char getGrade() {
        return grade;
    }

}
