import java.util.ArrayList;
import java.util.HashSet;

public class PracticeCollections {
	
	public static void main(String[] args)
	{
		//List
		ArrayList al = new ArrayList();  //10
		al.add(111);
		al.add("test");
		al.add(true);
		al.add('a');
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(1));
		
		//add();  to add the data in collection object
		//remove();  to delete specific data from collection
		//get();  to get/retrieve the data from collection
		
		System.out.println("---------------------");
		//set
		HashSet hs = new HashSet();
		hs.add(111);
		hs.add("test");
		hs.add(true);
		hs.add('a');
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("---------------");
		
		HashSet hs2 = new HashSet();
		hs2.addAll(al);  //addding one collection into another 
		System.out.println(hs2);
	}

}
