package org.example;


public class StudentException {
    private String name;
    private char gradeLevel;
    private double gpa;

    StudentException(String name, char gradeLevel, double gpa){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGpa){
        gpa = newGpa;
    }

    public String studentGrade(){
        return name + " has a gpa of " + gpa;
    }
}

