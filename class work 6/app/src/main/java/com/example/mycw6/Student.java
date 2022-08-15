package com.example.mycw6;

public class Student {
    private String studentname;
    private int studentage;
    private int studentgrade;
    private int studentimge;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }

    public int getStudentimge() {
        return studentimge;
    }

    public void setStudentimge(int studentimge) {
        this.studentimge = studentimge;
    }

   public Student(String studentname, int studentage, int studentgrade, int studentimge) {
            this.studentname = studentname;
            this.studentage = studentage;
            this.studentgrade = studentgrade;
            this.studentimge = studentimge;
    }
}
