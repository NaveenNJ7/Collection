package Set;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet present in java.util package and implements Set interface
		 * Insertion order maintains
		 * Duplicates wont allow
		 * Objects stored in terms of nodes and hashtable
		 * For each loop for traverse
		 */
		
		LinkedHashSet l = new LinkedHashSet();
		l.add(7);
		l.add("Docker");
		l.add(10.5);
		l.add(null);
		l.add(false);
		l.add("Docker");   // duplicate not allowed
		
		System.out.println("Maintaining insertion order");
		
		System.out.println(l);
		
		for(Object o: l)
		{
			System.out.println(o);
		}
		
		
		
	}
}
