package Linkedlist;

import java.util.*;

public class DemoMethods {

	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		
		System.out.println("Objects of ArrayList :"+a);
		
		LinkedList l = new LinkedList();
		
		// addAll()
		l.addAll(a);
		l.add(30);
		
		System.out.println("Objects of LinkedList :"+l);
		
		//containsAlll()
		System.out.println("Linked list contanins all objects of Array list :"+l.containsAll(a));
		
		//removeAll()
		l.removeAll(a);
		System.out.println("Objects of LinkedList after removing :"+l);
		
		System.out.println("Linked list contanins all objects of Array list :"+l.containsAll(a));
		
		l.add(60);
		l.add(20);
		l.add(90);
		l.add(40);
		
		System.out.println("Objects of l :"+l);
		
		//add(indexPosition, object)
		//in index of 0 10 will add and already existing element will gets shifted to next position
		l.add(0, 10);  
		
		System.out.println("Objects of l :"+l);
		
		//set(indexPosition, object)
		//50 will overridden(60) the object present in index position 2
		l.set(2, 50);
		
		System.out.println("Objects of l :"+l);
		
		l.set(4, 60);
		
		System.out.println("Objects of l before sorting :"+l);
		
		// Collections is class
		
		Collections.sort(l);
		
		System.out.println("Objects of l after sorting :"+l);
	}
	
}
