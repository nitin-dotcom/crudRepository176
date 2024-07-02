package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sr;
	
	@Override
	public Student saveStudentData(Student student) {
	         Student st=sr.save(student);
		
		return st;
	}

}
