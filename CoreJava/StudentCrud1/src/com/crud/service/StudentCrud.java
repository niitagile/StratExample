package com.crud.service;
import java.util.List;

import com.crud.model.Student;

public interface StudentCrud {
	
	int insert(Student student);
	int update(Student student);
	int delete(int rollno);
	List<Student> getAllRecords();
	Student getStudentByRollno(int rollno);
}
