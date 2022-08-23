package collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1  implements Comparable<Employee1>
{
	private int age;

	public int getAge() {
		return age;
	}

	public Employee1(int age) {
		super();
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee1 emp) {
		
		return this.age-emp.getAge();
	}



}
public class JavaComparableExample
{
	  public static void main(String args[])	
		 {
			
			
			ArrayList<Employee1> list=new ArrayList();
			list.add(new Employee1(40));
			list.add(new Employee1(130));
			list.add(new Employee1(50));
			Collections.sort(list);
			for(Employee1 emp : list){
				System.out.println(emp.getAge());
			}
			
			/*if( e1.compareTo(e2.getAge()) > 0 ) 
				{System.out.println("Employee one is elder than employee two !");
				} 
			else if( e1.compareTo(e2.getAge()) < 0 ) 
				{System.out.println("Employee one is younger than employee two !");
				} 
			else if( e1.compareTo(e2.getAge()) == 0 ) 
				{System.out.println("Both employees are same !");
				} */
		}
}


/*
	Signature of compareTo method is.
	public int compareTo(Object object).
	compareTo method should return 0 if both objects are equal,
	1 if first greater than other and -1 if first less than the other object of the same class.
	*/