package com.example.DemoProject.StudentManagementApplication.models;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @Column
    @GeneratedValue
    private int StudentRollNo;
    @Column
    private String FirstName;
    @Column
    private String LastName;
    @Column
    private String Department;
    @Column
    private String StudentEmail;
    @Column
    private String Password;

    public Student(int studentRollNo, String firstName, String lastName, String department, String studentEmail, String password) {
        StudentRollNo = studentRollNo;
        FirstName = firstName;
        LastName = lastName;
        Department = department;
        StudentEmail = studentEmail;
        Password = password;
    }

    public int getStudentRollNo() {
        return StudentRollNo;
    }

    public Student() {
    }

    public void setStudentRollNo(int studentRollNo) {
        StudentRollNo = studentRollNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentRollNo=" + StudentRollNo +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Department='" + Department + '\'' +
                ", StudentEmail='" + StudentEmail + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
