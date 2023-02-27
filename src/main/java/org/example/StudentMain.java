package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        try {
            String name;
            char gradeLevel;
            double gpa;
            logger.info("Enter name of the student : ");
            name = sc.nextLine();
            logger.info("Enter the grade level : ");
            gradeLevel = sc.next().charAt(0);
            logger.info("Enter GPA : ");
            gpa = sc.nextDouble();
            StudentException s = new StudentException(name, gradeLevel, gpa);
            String studentGrade = s.studentGrade();
            logger.info(studentGrade);
            s.updateGPA(94.6);
            studentGrade = s.studentGrade();
            logger.info(studentGrade);
        } catch (InputMismatchException e) {
            logger.info("Something went wrong while giving input");
        } catch (Exception e) {
            String s = "Something went wrong " + e;
            logger.info(s);
        }
    }
}
