
package Comparableinterface;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+" ID :"+id+" Salary :"+salary;
	}
	
	/* @Override
	public int compareTo(Employee e)
	{
		// return type is int, salary is double so make it casting
		return (int) (this.salary-e.salary);
	} */
	
	/*@Override
	public int compareTo(Employee e)
	{
		return e.id-this.id;  // sorting reverse, that is descending order
	} */
	
	public int compareTo(Employee e)
	{
		return this.name.compareTo(e.name);
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Arun", 2, 20.5);
		Employee e2 = new Employee("Dinesh", 7, 45.5);
		Employee e3 = new Employee("Chetan", 4, 60.67);
		Employee e4 = new Employee ("bharat", 3, 45.78); 
		Employee e5 = new Employee("Mallu", 5, 50.45);
		Employee e6 = new Employee("pavvi", 6, 60.85);
		/*
		 here if we sorting salary, it will sort based on non decimal values.
		 45.5 and 45.78 here decimal values are different but it compare only non decimal
		 45 and 45 it treat them as duplicate so it will not print and same for 60.67 and 60.85
		 if we want sort it on decimal values we need to write logic for that
		 
		 but if we sort it based on id and name, it will not check duplicate of salary
		 
		 */
		TreeSet<Employee> t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		for(Employee o: t)
		{
			System.out.println(o);
		}
		
	}
	
	
	
}
