package com.crud.controller;

import java.util.List;

import com.crud.model.Student;
import com.crud.service.StudentService;

public class StudentController {
	
	StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	
	public int insert(Student student) {
		
		return studentservice.insert(student);
	}

	
	public int update(Student student) {
		
		return studentservice.update(student);
	}

	
	public int delete(int rollno) {
		
		return studentservice.delete(rollno);
	}

	
	public List<Student> getAllRecords() {
		
		return studentservice.getAllRecords();
	}

	
	public Student getStudentByRollno(int rollno) {
		
		return studentservice.getStudentByRollno(rollno);
	}
	
	
	

}
