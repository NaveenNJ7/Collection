package PraComparator;

import java.util.Comparator;

public class EmployeeSortingByName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee x, Employee y) {
		
		return x.name.compareTo(y.name);
		
	}

}
