package collections;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	
@Override
	public int hashCode() {
		System.out.println("Hash code called");
		return (int) salary;
}


@Override
public boolean equals(Object obj) {
	System.out.println("Equals method called");
	Employee emp=(Employee)obj;
	if (this.empId==emp.empId && 
			this.name.equals(emp.name) &&
			this.salary==emp.salary)
	{
		
		return true;
	}
	else
		{
		return false;}
		}		

}

