package collections;

import java.util.Vector;

/*Create a Vector object that can hold any type of object : Student or Teacher or HOD. 
 * Write a java code that creates these objects and inserts them into the list. 
 * Make sure that toString() is overridden in all the classes. 
 * Print out the list that displays the string representation of the object. 
 * It should also print the object type such as Student, Teacher or HOD. 
	
(hint : use instanceof to determine the type of object)

 * */

class HOD{

	@Override
	public String toString() {
		return "HOD [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
class Student1{

@Override
	public String toString() {
		return "Student1 [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}



	

class Teacher{

	@Override
	public String toString() {
		return "Teacher [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
public class Assignmnet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vector<Object> vector=new Vector<>();
			vector.add(new HOD());
			vector.add(new Student1());
			vector.add(new Teacher());
			System.out.println(vector);
			
			for(Object obj : vector){
				if (obj instanceof HOD)
					System.out.println("object class is HOD");
				if (obj instanceof Student1)
					System.out.println("object class is Student1");
				if (obj instanceof Teacher)
					System.out.println("object class is Teacher");
			}
			
	}

}
