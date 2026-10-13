package ComparatorEmployee;

import java.util.Comparator;

public class EmployeeSortbySalary implements Comparator<Employee> {
	
	
	@Override
	public int compare(Employee m, Employee n)
	{
		/*
		  if we want 
		 */
		return m.salary.compareTo(n.salary);
	}
	
	
	
	

}
