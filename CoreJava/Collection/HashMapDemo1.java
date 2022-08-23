package collections;

import java.util.*;
public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String str : args)
		{
			Integer i = str.length();
			map.put(str , i);
		}
		System.out.println(map.size()+" distinct words");
		System.out.println("Contents of map are "+map);
		
		Collection c= map.values();
		Iterator itr = c.iterator();
		
		while (itr.hasNext())
		{
			System.out.println("Printing using while :"+ itr.next());
		}

		for(String key: map.keySet())
		{
			System.out.println("Printing using for :"+map.get(key));
			
		}
		
	
	}
}







//for (Object key: hMap.keySet()) {
//System.out.println(hMap.get(key));
//}
