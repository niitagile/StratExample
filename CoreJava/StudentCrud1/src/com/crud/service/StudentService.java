package com.crud.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.crud.model.Student;

public class StudentService implements StudentCrud {

	@Override
	public int insert(Student student) {
		int result = 0;
		try {
			Connection con = StudentConnection.getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			String sql="insert into studentDetails(rollno, studname,dob) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getStudname());
			ps.setDate(3, sdob);
			
			result=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(Student student) {
		int result = 0;
		try {
			Connection con = StudentConnection.getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			String sql="update studentDetails set studname=?,dob=? where rollno=?";;
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, student.getStudname());
			ps.setDate(2, sdob);
			ps.setInt(3, student.getRollno());
			
			result=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(int rollno) {

		int result = 0;
		try {
			Connection con = StudentConnection.getConnection();
			String sql="delete from studentdetails where rollno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, rollno);
			result=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Student> getAllRecords() {
		ArrayList<Student> list = new ArrayList<>();
		try {
			Connection con = StudentConnection.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Student getStudentByRollno(int rollno) {
		Student student = null;
		try {
			Connection con = StudentConnection.getConnection();
			String sql="";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

}
