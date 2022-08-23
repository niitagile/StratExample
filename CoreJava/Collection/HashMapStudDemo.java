 package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student{
	String StudId;
	String name;
	int age;
	Student(String sid,String sname, int a)
	{
		StudId=sid;
		name=sname;
		age=a;
	}
	public String getStudId() {
		return StudId;
	}
	public void setStudId(String studId) {
		StudId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class HashMapStudDemo {
	public static void main(String[] args) 
	{
		
		Map<String,Student> studentMap = new HashMap<String,Student>();
		Student s1=new  Student("101","Sitha",30);
		Student s2=new  Student("102","Neetha",20);
		Student s3=new  Student("103","Ramesh",20);
		
		studentMap.put("101",s1);
		studentMap.put("102",s2);
		studentMap.put("103",s3);
		
		if(studentMap.containsKey("102")){
		Student obj=	studentMap.get("102");
		System.out.println(obj);
		System.out.println(obj.getName() +"\t"+obj.getAge());
			//System.out.println(studentMap.get("102").getName()+"\t"+studentMap.get("102").getAge());
		}
		
		
		
		
		/*
		
		
		
		
		
		System.out.println(studentMap.size()+" distinct object");
		System.out.println("Contents of map are "+studentMap);
		

		for(String key: studentMap.keySet())
		{
			System.out.println("Key : " +key +" Value : "+studentMap.get(key).getName()+"   "+   studentMap.get(key).getAge());
			
		}
		
	*/
	}
}










/*Collection c= map.values();
		Iterator itr = c.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Printing using while :"+ itr.next());
		}
		
 */
  
