package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> listName=new ArrayList<>();
		listName.add("Kavita");
		listName.add("Manish");
		listName.add("Nimesh");
		listName.add(1,"Jyoti");
		
		//	listName.add(67);
		System.out.println(listName);
		
		System.out.println("Element present="+listName.contains("Manish"));
		listName.remove(2);
		System.out.println(listName);*/
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(23);
		list.add(6);
		System.out.println(list);
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println("Output through Iterator");
		Iterator it=list.iterator();// readonly and forward only
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
		
		System.out.println("Output of List Iterator");
		ListIterator lt=list.listIterator();// readonly but forward and backword
		while(lt.hasNext())
			System.out.println(lt.next());
		while(lt.hasPrevious())
			System.out.println(lt.previous());
		
		
		System.out.println("For enhanced loop");
		for(Integer obj : list)
			System.out.println(obj);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}

}
