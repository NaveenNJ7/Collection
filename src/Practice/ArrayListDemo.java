package Practice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		/*
		Allows heterogeneous
		It allows duplicates
		It maintains insertion order 
		*/
		
		a.add(10);
		a.add(20);
		a.add(30.5);
		a.add(40);
		a.add("java");
		a.add(null);
		a.add(10); // duplicate 10 and 20
		a.add(20);
		
		System.out.println(a);
		
		System.out.println("size of array list"+a.size());
		
		System.out.println(a.contains("java")); // true
		
		System.out.println("Value of Index position 2 :"+a.get(2));
		
		System.out.println("index position of 10 :"+a.indexOf(10));
		
		System.out.println("index position of 10 :"+a.lastIndexOf(10));
		
		System.out.println(a.isEmpty()); // false
		
		a.remove(5); // removed null
		
		System.out.println(a);
		System.out.println("size of array list"+a.size());
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i)+"  ");
		}
	}
}
