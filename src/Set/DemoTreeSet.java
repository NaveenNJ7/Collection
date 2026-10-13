package Set;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		/*
		 * TreeSet - pre defined class present in java.util package
		 * maintains sorting order
		 * Duplicates not allowed
		 * underlined data structure is binary tree
		 * when we add objects into tree set internally it calls compareTo()
		   it will compare objects and sort it
		 * this compareTo() method will return int (+1,0,-1)  
		 * When we have generics or homogeneous objects it will sort but not for heterogeneous
		 * suppose if we add integers into TreeSet it will call compareTo() method from
		   Integer class (wrapper class) same for compareTo() from Double and String from String
		   int a=10;
		   t.add(10); or t.add(new Integer(10));
		 * This compareTo() method present in comparable interface, methods in interface will be 
		   abstract method but these wrapper classes implements comparable interface and 
		   overridden the compareTo() method
		 * Traverse order in TreeSet is LeftNode ParentNode RightNode
		 *      
		 */
		
		TreeSet<Integer> t = new TreeSet();
		t.add(45);  // 45 is root node compareTo() method will compare remaining object with
		t.add(25);  // root node only, after comparing if it gives -1 it will move left
		t.add(35);  // if it gives +1 it will move right, if it gives 0 it will be discard
		t.add(15);
		t.add(55);  // t.add(new Integer(55))
		
		System.out.println("Sorting order :"+t);
		
		for(Object i: t) // instead of Object we can write Integer
		{
			System.out.println(i);
		}
		
		TreeSet<Double> s = new TreeSet();
		s.add(30.5);  //s.add(new Double(30.5))
		s.add(10.5);
		s.add(40.5);
		s.add(20.5);
		s.add(50.5);
		
		System.out.println(s);
		
		for(double d: s)
		{
			System.out.println(d);
		}
		
		TreeSet ts = new TreeSet();
		ts.add("Java");  //ts.add(new String("Java"));
		ts.add("Python");
		ts.add("Eclipse");
		ts.add("MySQL");
		ts.add("PlayWright");
		
		System.out.println(ts);
		
	/*	for(String s: ts)
		{
		  even though all objects are String here we cant write String element type because   
		  we didnt mention generics(String) in TreeSet object. we should write element type Object only.
		  
		  suppose in generics if we mention <String> then we can write String element type in 
		  for loop. if we not mention anything means we should write Object only 
		} */
		
		for(Object m: ts)
		{
			System.out.println(m);
		}
	}
}
