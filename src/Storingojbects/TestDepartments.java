package Storingojbects;

import java.util.ArrayList;

public class TestDepartments {

	
	public static void main(String[] args) {
		
		Departments d1 = new Departments("Pavitra");
		Departments d2 = new Departments("Soumya");
		Departments d3 = new Departments("Priyanka");
		
		ArrayList<Departments> a = new ArrayList();
		a.add(d1);
		a.add(d2);
		a.add(d3);
		
		/*
		 here we have not overridden toString() if we print object reference 
		 fully qualified class will display or string representation
		 
		  if call name using object reference we get name we passed
		 */
		for(Departments dt: a) // instead of Departments we can use Object
		{
			System.out.println(dt);   // object reference
			System.out.println(dt.dname);  
		}
		
		// normal for loop
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
			System.out.println(a.get(i).dname);
		}
		
	}
}
