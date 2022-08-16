package ClassesExamples;

public class Employee {
	private int empid;
	private String empname;
	//block which is having same name as class and use to initialize your object
	public Employee(int empid, String empname){
		this.empid=empid;
		this.empname=empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee(23,"Mahendra");
		System.out.println("Employee Id::"+employee.getEmpid());
		System.out.println("Employee name::"+employee.getEmpname());
	}

}
