package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository repo;

	@Override
	public Student fetchStudentDetails(int id) {
		Student s=repo.getById(id);
		return s;
		
	}

	@Override
	public List<Student> fetchall() {
		return repo.findAll();
	}

}
