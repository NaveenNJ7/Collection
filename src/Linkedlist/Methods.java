package Linkedlist;

import java.util.ArrayList;

import java.util.LinkedList;

public class Methods {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(45);
		l.add(30);
		l.add(20);
		System.out.println(l);
		
		
		
		System.out.println("Array lsit collection "+l);
		LinkedList ln = new LinkedList();
		
		// addAll() used to store objects from one collection to another collection
		ln.addAll(l);
		ln.add(50);
		ln.add("added Successfully");
	
		System.out.println("LinkedList collection "+ln);
		/*
		 * containsAll() will check if one collection contains all objects of another collection
		 */
		System.out.println("Is Linked list collection contains obects of ArrayList collection = "+ln.containsAll(l));
		
		System.out.println(ln);
		
		//removeAll() used to remove all objects of one collection from another collection
		ln.removeAll(l);
		
		System.out.println("Removed all objects of ArryList from LinkedList = "+ln);
		
		System.out.println("-------------------------------------------");
		
		ArrayList A = new ArrayList();
		A.add(25);
		A.add(45);
		A.add(55);
		A.add(65);
		
		// collections
	    // Collections.sort(A);
		
		System.out.println(A);
		/*add(index, object) used to add element based on index position, 
		 already existing element will shift to next index position
		 */
		A.add(1, 35);
		System.out.println(A);
		
		
		/* set(index, object) used to add an element based on index position,
		   already existing element will gets overridden
		 */
		A.set(1, "Set properly");
		System.out.println(A);
	
		
		
		
	}

}
