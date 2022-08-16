package ClassesExamples;
//public can be accessable in any package
public class Student {
	//instance variables
	private int rollno;
	private String name;
	
	private float total;
	private String grade;
	//methods
	
	public void setRollno(int rollno){
		this.rollno=rollno; //this indicates the current object
	}
	
	public int getRollno(){
		return rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	public String calculateGrade() {
		if(total>=80)
			this.grade="A";
		else
			this.grade="B";
		return this.grade;
		
	}
	

}
