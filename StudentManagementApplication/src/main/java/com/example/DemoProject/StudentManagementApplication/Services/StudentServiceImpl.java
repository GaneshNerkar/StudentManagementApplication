package com.example.DemoProject.StudentManagementApplication.Services;

import com.example.DemoProject.StudentManagementApplication.Repositories.StudentRepository;
import com.example.DemoProject.StudentManagementApplication.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceIFC{
    @Autowired
    StudentRepository studRepo;
    @Override
    public List<Student> getAllStudents() {
        return studRepo.findAll();
    }
}
