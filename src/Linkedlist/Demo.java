package Linkedlist;

import java.util.ArrayList;

public class Demo {

	
	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(20);
		l.add(50);
		
		int i;                                // length for array 
		for(i=0; i<l.size();i++)             // size() for collection
		{                                   // length() for String 
			System.out.println(l.get(i));  // collection have methods
		}
		
		System.out.println("-------------");
		
		int[] x = {1,5,6,8,7,9};
		
		for(i=0; i<x.length; i++)
		{
			System.out.println(x[i]);  // array does not have any methods
		}
		
		System.out.println("-------------");
		
		String s = "Naveen";
		System.out.println(s.length()); // string so using length()
		
	}
	
	
	
	
	
}
