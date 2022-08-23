package collections;
import java.util.*;

public class EmpHashSetEqualsDemo {	
	
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		System.out.println("Created the hash Set object");
		Employee e1= new Employee(1,"Anu",10000);
		System.out.println("Going to add the 1st obj");
		employees.add(e1);
		System.out.println("Created & added first object");
		
		Employee e2 = new Employee(1,"Anu",30000);
		System.out.println("Created second object");
		System.out.println("Going to add 2nd object to the hashset");
		
		employees.add(e2);
		
		Employee e3 = new Employee(2,"Arunima",20000);
		System.out.println("Created third object");
		System.out.println("Going to add 3rd object to the hashset");
		
		employees.add(e3);
		System.out.println("Back to main");
		for(Employee emp:employees)
		{
			System.out.println(emp.getEmpId()+"\t"+emp.getName()+"\t"+ emp.getSalary());
		}

	}

}
