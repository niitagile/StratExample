package Design_pattern.structural;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Base class
class Student{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
/****************************************************************************/
//Implementation
interface StorageRepository{
    public void store(Student entiy);
}


class FileRepository implements StorageRepository{
	public void store(Student entiy){
	try {
	
		FileOutputStream fileOut = new FileOutputStream("student.txt");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(entiy);
		objectOut.close();
	
		} catch (IOException e) {
	
			e.printStackTrace();}
	}
}

class DataBaseRepository implements StorageRepository{
	public void store(Student entiy){
	
	System.out.println("Save in Database");
	}

}


/*****************************************************************************/
//Bridge
class StudentRepository  {

	  private StorageRepository repository;
	  public StudentRepository(StorageRepository repository){
	      this.repository=repository;
	  }
		public StorageRepository getRepository(){
			return repository;
		}

	   public Student save(Student student) {

	  	 if (student == null || student.getName() == null) {
		            return null;
		        }
		        
		        repository.store(student);
		        return student;
	  }
		
	}


class BridgeExample1{
	public static void main(String[] args) {
		Student s=new Student();
		s.setRollno(1);
		s.setName("Anil");
		StudentRepository repo=new StudentRepository(new FileRepository());
		repo.save(s);	
	}
}