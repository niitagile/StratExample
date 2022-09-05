package com.crud.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.crud.controller.StudentController;
import com.crud.model.Student;
import com.crud.service.StudentService;

public class StudentView {
	public static void main(String[] args) throws ParseException  {
		StudentService service=new StudentService();
		StudentController studentctrl = new StudentController(service);
		int result;
		Student student = null;
		int rollno;
		String name;
		Date dob = null;
		int choice;
		while(true){
		System.out.println("1. Add Record");
		System.out.println("2. Update Record");
		System.out.println("3. Delete Record");
		System.out.println("4. View Records");
		System.out.println("5. View a Record");
		System.out.println("0. Exit ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		 choice = sc.nextInt();
		 switch(choice){
		 case 1:
			 	System.out.println("Enter rollno, name, dob");
				rollno = sc.nextInt(); 
				sc.nextLine();
				name = sc.nextLine();
				dob = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());

				student = new Student(rollno, name, dob);
				result = studentctrl.insert(student);
				if (result > 0)
					System.out.println("Record Inserted");
				else
					System.out.println("Record not inserted");
			 break;
		 case 2:
			 System.out.println("Enter rollno, name, dob");
				rollno = sc.nextInt(); 
				sc.nextLine();
				name = sc.nextLine();
				dob = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());

				student = new Student(rollno, name, dob);
				result = studentctrl.update(student);
				if (result > 0)
					System.out.println("Record updated");
				else
					System.out.println("Record not updated");
			 break;
		 case 3:
			 System.out.println("Enter rollno");
				rollno = sc.nextInt();
				result = studentctrl.delete(rollno);
				if (result > 0)
					System.out.println("Record deleted");
				else
					System.out.println("Record not found");
				break;
			
		 case 4:
			 List<Student> list=studentctrl.getAllRecords();

				for(Student stud : list){
					System.out.println(stud.getRollno()+"\t"+stud.getStudname()+" "+stud.getDob());
				}
			 break;
		 case 5:
			 System.out.println("Enter rollno");
				rollno=sc.nextInt();
				student=studentctrl.getStudentByRollno(rollno);
				System.out.println("Rollno="+student.getRollno());
				System.out.println("name="+student.getStudname());
				System.out.println("DOB="+student.getDob());
				
			 break;
		 case 0:System.exit(0);
			 break;
		 }
	}
	}
}
