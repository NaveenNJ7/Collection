package Set;

import java.util.TreeSet;

public class Treeset {
	
	
	
	public static void main(String[] args) {
		
		// tree set is homogeneous, because it compares and sort
		// if we enter heterogeneous it will give Exception 
		
	/*	TreeSet U = new TreeSet();
		U.add(20);
		U.add("jAVA");
		U.add(10.5);
		
		System.out.println(U); */
		
		
		
		TreeSet<Integer> t = new TreeSet();
		/* here we entered objects in one manner, but it will sort those and 
		   print the objects in Natural order(ie Ascending)
		 */
		
		t.add(10);
		t.add(40);
		t.add(30);
		t.add(20);
		t.add(20);
		t.add(10);
		t.add(50); 
		
		// original size is 7
		// duplicate not allowed
		
		System.out.println("Size is : "+t.size()+"  and objects are "+t);
		
		for(Integer i:t)
		{
			System.out.println(i);
		}
		
		TreeSet<String> s = new TreeSet<String>();
		
		s.add("Mango");
		s.add("Banana");
		s.add("Watermelon");
		s.add("Apple"); // 65
		s.add("apple"); // a is lowerCase, 97
		
		// it will check first letter for sorting
		
		System.out.println(s);
		for(String g: s)
		{
			System.out.println(g);
		}
		
		
	}

}
