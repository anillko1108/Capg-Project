package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public interface StudentService {
Student fetchStudentDetails(int id);
List<Student> fetchall();
}
