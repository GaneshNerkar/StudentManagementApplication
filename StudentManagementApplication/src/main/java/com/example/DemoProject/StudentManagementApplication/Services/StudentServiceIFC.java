package com.example.DemoProject.StudentManagementApplication.Services;

import com.example.DemoProject.StudentManagementApplication.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServiceIFC {

    public List<Student> getAllStudents();
}
