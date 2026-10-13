package ArrayListType;

import java.util.ArrayList;

public class DemoMethods {

	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(10); //int
		a.add(20.5); //double
		a.add(10); // duplicate
		a.add("Java"); // string
		a.add(null); // null  --> total heterogeneous
		
		System.out.println(a);
		
	    /* here we print object reference internally ArrayList override toString() so we get
		   objects present in array instead of string representation
		*/
		
		System.out.println(a.size());
		
		System.out.println(a.get(1));
		
		System.out.println(a.contains("Java")); //true
		System.out.println(a.contains("JAVA")); //false
		
		a.remove(4); 
		System.out.println(a); // null removed
		
		//if duplicates(10) present it gives index position of first occurrence
		System.out.println(a.indexOf(10)); 
		
		// gives index position of duplicate value which present at last
		System.out.println(a.lastIndexOf(10));
		
		// if there is no object present like 100 is not there so it gives -1 answer
		System.out.println(a.indexOf(100));
		
		// clear method remove all objects form list
		a.clear();
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		
		
		
	}
}
