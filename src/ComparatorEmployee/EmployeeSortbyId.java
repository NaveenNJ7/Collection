package ComparatorEmployee;

import java.util.Comparator;

public class EmployeeSortbyId implements Comparator<Employee> {
	
	/*
	 steps to make class to implement comparator
	 1) implement Comparator interface
	 2) mention Generic type
	 3) import Comparator interface from java.util package
	 4) override abstract method
	 5) create object of this class, in main method where it present
	 */
	
	@Override
	public int compare(Employee x, Employee y)
	{
		// ascending order          // descending order
		return x.id - y.id;         // y.id - x.id
	}                               // we can also use compareTo() for int type data  
                                    // but int should be wrapper class that is Integer
}
