package ClassesExamples;

import java.util.Scanner;

public class StudentDriveClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student1=new Student();
		System.out.println("Enter rollno");
		student1.setRollno(sc.nextInt());
		System.out.println("Enter name");
		student1.setName(sc.next());
		System.out.println("Enter total");
		student1.setTotal(sc.nextFloat());	
		
		
		Student student2=new Student();
		System.out.println("Enter rollno");
		student2.setRollno(sc.nextInt());
		System.out.println("Enter name");
		student2.setName(sc.next());
		System.out.println("Enter total");
		student2.setTotal(sc.nextFloat());	
		
		
		System.out.println("Information about Ist student");
		System.out.println("Rollno="+student1.getRollno());
		System.out.println("Name="+student1.getName());
		System.out.println("Total="+student1.getTotal());
		System.out.println("Information about IInd student");
		System.out.println("Rollno="+student2.getRollno());
		System.out.println("Name="+student2.getName());
		System.out.println("Total="+student2.getTotal());
		
		
	
	}

}
