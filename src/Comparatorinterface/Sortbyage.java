package Comparatorinterface;

import java.util.Comparator;

public class Sortbyage implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y)
	{
		// Ascending order
		return x.age - y.age;        // Descending order y.age-x.age;
	}
	
	// x is object to be inserted and y is already existing object
	
	
}
