package collections;
import java.util.*;

class Employee2
{
	private int age;
	private String name;
	public void setAge(int age)
	{        
		this.age=age;
	}
	public int getAge(){          
		return this.age;
	}
	public void setName(String name)
	{         
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public Employee2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}    
	
}

class AgeComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 arg0, Employee2 arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge()-arg1.getAge();
	}

	
}

class NameComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 arg0, Employee2 arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}
	
}

public class JavaComparatorExample{
	public static void main(String args[]){

		ArrayList<Employee2> list=new ArrayList<>();
		list.add(new Employee2(23, "Manisha"));
		list.add(new Employee2(12, "Anisha"));
		list.add(new Employee2(28, "Nisha"));
		list.add(new Employee2(90, "Kanisha"));
		
		AgeComparator ac= new AgeComparator();
		Collections.sort(list,ac);
		System.out.println("List According to age");
		for(Employee2 emp : list){
			System.out.println(emp.getAge()+"\t"+emp.getName());
		}
		
		NameComparator nc= new NameComparator();
		Collections.sort(list,nc);
		System.out.println("List According to name");
		for(Employee2 emp : list){
			System.out.println(emp.getAge()+"\t"+emp.getName());
		}
	}
}
