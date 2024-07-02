package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@RestController
public class StudentController 
{
   @Autowired StudentService studentservice;
   
   @PostMapping("/postStudentInfo")
   public ResponseEntity<Student> postStudent(@RequestBody Student student)
   {
	  Student st= studentservice.saveStudentData(student);
	  return new ResponseEntity<Student>(st,HttpStatus.CREATED); 
   }
   @GetMapping("/getStudent")
   public ResponseEntity<List<Student>> getAllStudent()
   {
	   List<Student> st=studentservice.getStudent();
	   return new ResponseEntity<List<Student>> (st,HttpStatus.OK);
   }

   
}
