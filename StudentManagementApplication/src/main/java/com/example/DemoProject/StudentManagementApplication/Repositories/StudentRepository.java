package com.example.DemoProject.StudentManagementApplication.Repositories;

import com.example.DemoProject.StudentManagementApplication.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
