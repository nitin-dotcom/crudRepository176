package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sr;
	
	@Override
	public Student saveStudentData(Student student) {
	         Student st=sr.save(student);
		
		return st;
	}

}
