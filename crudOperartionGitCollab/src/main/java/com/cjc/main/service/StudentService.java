package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;

public interface StudentService {

	public Student saveStudentData(Student student);

	public List<Student> getStudent();

}
