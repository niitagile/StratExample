package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

 class Applicant {
	String name, id, language;
	
	public Applicant(){
		name="Shyam";
		id="101";
		language ="java";
	}
	public Applicant(String name, String id, String language) {
		super();
		this.name = name;
		this.id = id;
		this.language = language;
	}

	@Override
	public String toString() {
		return name+" has id -"+id+" & knows "+language+" language";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	
}

public class InterviewSchedule {
	
	Queue<Applicant> listofapplicants = new LinkedList<Applicant>();
	
	
	//will maintain a pool of all applicants
	public void addApplicant(){
		//add all the applicants
		listofapplicants.add(new Applicant("harish", "101","testing"));
		listofapplicants.add(new Applicant("Mani", "102","java"));
		listofapplicants.add(new Applicant("lakshmikant", "103",".Net"));
		listofapplicants.add(new Applicant("Jaideep", "104","IOS"));
		listofapplicants.add(new Applicant("Sandeep", "105",".Net"));
		listofapplicants.add(new Applicant("Prahlad", "106","Java"));
		listofapplicants.add(new Applicant("Ajitesh", "107","java"));
		
	}
	//print all the applicants list
	public void showApplicants(){
		Iterator<Applicant> i = listofapplicants.iterator();
		System.out.println("=================Applicant's List===========");
		while(i.hasNext()){
			Applicant obj = i.next();
			System.out.println(obj);
		}
	}
	//will read the applicant details one by one
	//& send them for interview & 
	//remove their name from list
	public void interviewApplicant(){
		System.out.println("========Interview scheduled for the person=======");
		Applicant obj = listofapplicants.poll();
		System.out.println(obj.getName()+" is interviewed");
	}
	
	public static void main(String[] args) {
		InterviewSchedule obj = new InterviewSchedule();
		
		obj.addApplicant();
		obj.showApplicants();
		
		System.out.println("Scheduling interview for 5 candidates");
		for(int i=1; i<=5; i++){
			obj.interviewApplicant();
		}
		
		System.out.println("Applicants not scheduled for interview ");
		obj.showApplicants();
	}

}
