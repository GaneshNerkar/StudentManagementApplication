package com.example.DemoProject.StudentManagementApplication.Controllers;

import com.example.DemoProject.StudentManagementApplication.Services.StudentServiceIFC;
import com.example.DemoProject.StudentManagementApplication.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentServiceIFC studentService;

    @GetMapping("/EnterHome")
    public String EnterHome() {
        return "Welcome to home...Ganesh!!!";
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

}
