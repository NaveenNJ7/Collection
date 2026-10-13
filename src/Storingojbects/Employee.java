package Storingojbects;

import java.util.ArrayList;

public class Employee {

	// without overriding toString() method
	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 25);
		Employee e2 = new Employee("Cena", 28);
		Employee e3 = new Employee("Brock", 30);
		
		// using generics
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		/*
		 Employee is the traversing data type, e it will fetch objects one by one and print and 
		 l is the arraylist which storing the employee objects.
		 
		 here if we print s.o.p(e), it will give fullyqualifiedclass so we need to call it by e.name and e.id
		 */
		
		System.out.println("Employee details");
		for(Employee e: l)
		{
			System.out.println("Name :"+e.name+" and ID :"+e.id);
		}
		
	}
	
	
	
}
