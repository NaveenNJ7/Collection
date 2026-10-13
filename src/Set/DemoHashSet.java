package Set;

import java.util.HashSet;

public class DemoHashSet {

	
	public static void main(String[] args)
	{
		
		/*
		 Hash set present in java.util package and implements Set interface
		 * does not maintain insertion order, *duplicates wont allow
		 * its not index based, 
		 * objects stored in terms of key and value pair
		 * when we create an object of HashSet internally HashTable will create
		 * when we add element or object, each element will get hashCode() and it will be unique
		 * hashCode() of element will store in Key and element will store in value
		 * hashCode() and equals() methods are responsible for removing duplicates
		 * initial capacity of table is 16
		 * incremental capacity is or fill ratio or load factor is 0.75 or 75%
		 * underlined data structure is hash table
		 * Since it is not index based get() method will work here
		 * get() method will get object based on index position
		 * then for traversing HashSet we use for each loop or iterators
		 */
		
		HashSet s = new HashSet();
		s.add(10);
		s.add(true);
		s.add(10);  // duplicate not allowed
		s.add(55.5);
		s.add("Set");
		s.add('H');
		
		System.out.println("Does not maintain insertion order");
		System.out.println(s);
		
		for(Object obj: s)
		{
			System.out.println(obj);
		}
		
	}
	
}
