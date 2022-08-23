package collections;

import java.util.ArrayList;

class PersonalDetails{
	private String name, email, postal;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public PersonalDetails(String name, String email, String postal) {
		super();
		this.name = name;
		this.email = email;
		this.postal = postal;
	}

	public String getPostal() {
		return postal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}
	
}
public class Assignment {

	public static void main(String[] args) {
		ArrayList<PersonalDetails> list=new ArrayList<>();
		list.add(new PersonalDetails("Ajay","ajay@gmail.com",null));
		list.add(new PersonalDetails("Monish","Monish@gmail.com",null));
		list.add(new PersonalDetails("Chetra",null, "Delhi"));
		list.add(new PersonalDetails("Deepesh",null,"Mumbai"));
		list.add(new PersonalDetails("Tavish","tavish@gmail.com",null));
		
		System.out.println("List with postal");
		for(PersonalDetails p : list){
			if(p.getPostal()!=null)
				System.out.println(p.getName()+"\t"+p.getPostal());
		}
		
		
		System.out.println("List with email");
		for(PersonalDetails p : list){
			if(p.getEmail()!=null)
				System.out.println(p.getName()+"\t"+p.getEmail());
		}

	}

}
