package Comparatorinterface;

import java.util.Comparator;

public class Sortbyname implements Comparator<Student>{
	
	
	// overrider abstract method present in Comparator
	
	public int compare(Student x, Student y)
	{
		return x.name.compareTo(y.name);
	}

}
