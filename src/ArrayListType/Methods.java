package ArrayListType;

import java.util.ArrayList;

public class Methods {
	
	
	public static void main(String[] args) {
		
		// create an object of arraylist and import it from java.util package
		ArrayList l = new ArrayList();
		
		// add objects to the collection
		// duplicates allow
		l.add(10);
		l.add(20);
		l.add("Java");
		l.add(10);
		l.add(null);
		l.add(30);
		l.add(40);
		l.add(20);
		
		
		/* in arraylist if we print object reference, instead of getting fullyqulifiedclass name as output 
		   we will get list of objects as output, because in array list internally it override the
		   toString()
		 */
		
		System.out.println(l);
		System.out.println("----------------");
		
		System.out.println(l.size()); // 8
		System.out.println("----------------");
		
		System.out.println(l.get(2)); // java
		System.out.println("----------------");
		
		System.out.println(l.contains(null));
		System.out.println("----------------");
		
		System.out.println(l);
		l.remove(6); // 40 removed
		System.out.println(l);
		System.out.println("----------------");
		
		System.out.println(l.isEmpty());
		System.out.println("----------------");
		
		l.clear();
		System.out.println("----------------");
		
		System.out.println(l.isEmpty());
		System.out.println("----------------");
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(10);
		a.add(30);
		a.add(40);
		a.add(10);
		
		System.out.println(a); //0
		System.out.println("----------------");
		
		System.out.println(a.indexOf(10));
		System.out.println("----------------");
		
		System.out.println(a.lastIndexOf(10)); //5
		System.out.println("----------------");
	}

}
