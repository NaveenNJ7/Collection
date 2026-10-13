package ComparatorEmployee;

import java.util.Comparator;

public class EmployeeSortbyName implements Comparator<Employee> {

	
	@Override
	public int compare(Employee p, Employee q)
	{
		return p.name.compareTo(q.name);
	}
	
	
	
	
}
