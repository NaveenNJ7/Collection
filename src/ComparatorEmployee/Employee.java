package ComparatorEmployee;

import java.util.TreeSet;

public class Employee {
	
	
	String name;
	int id;
	Double salary;
	
	// alt+shift+s - short cut key for generating constructor
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+"\nid :"+id+"\nsalary :"+salary+"\n-----------";
	}
	
	// we can create another class for create objects of Employee and storing objects into TreeSet
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jagan", 2, 15.55);
		Employee e2 = new Employee("Abhijit", 1, 15.33);
		Employee e3 = new Employee("Lal", 3, 15.11);
		Employee e4 = new Employee("Karan", 4, 15.44);
		Employee e5 = new Employee("Manu", 5, 15.22);
		
		// create object of class which sort based on particular object
		EmployeeSortbyId id = new EmployeeSortbyId(); 
		EmployeeSortbySalary sal = new EmployeeSortbySalary();
		EmployeeSortbyName nam = new EmployeeSortbyName();
		
		// we can give any object reference and pass it in TreeSet constructor
		TreeSet<Employee> e = new TreeSet(nam);
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		for(Employee o: e)
		{
			System.out.println(o);     // o/p id - 1,2,3,4,5 - abhi, jag, lal, kar,man, 
		}
		                               // salary - 11,22,33,44,55 - lal, manu, abhi, kara, jaga
		
		                               // name - abh, jag, kar lal, man 
		
		
		
		
		
		
	}
	
	

}
