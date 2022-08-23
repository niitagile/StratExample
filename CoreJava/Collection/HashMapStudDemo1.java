package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student123{
	String StudId;
	String name;
	int age;
	Student123(String sid,String sname, int a)
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
public class HashMapStudDemo1 {
	public static void main(String[] args) 
	{
		Map<String,Student123> studentMap = new HashMap<String,Student123>();
		Student123 s1=new  Student123("S1","Sitha",30);
		Student123 s2=new  Student123("S2","Neetha",20);
		Student123 s3=new  Student123("S3","Ramesh",20);
		
		studentMap.put("S1",s1);
		studentMap.put(s2.getStudId(), s2);
		studentMap.put(s3.getStudId(), s3);
		
		System.out.println(studentMap.size()+" distinct object");
		System.out.println("Contents of map are "+studentMap);
		for(String key : studentMap.keySet() ) {
			Student123 s=studentMap.get(key);
			System.out.println(s.getName()+" "+s.getAge());
		}
			
		

		
		
	
	}
}










/*Collection c= map.values();
		Iterator itr = c.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Printing using while :"+ itr.next());
		}
		
 */
  
