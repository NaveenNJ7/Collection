package UserDefinedObjectsInTreeSet;

import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(45, "John", 450.55);
		Employee e2 = new Employee(15, "Cena", 350.77);
		Employee e3 = new Employee(25, "Curt", 250.55);
		
		TreeSet<Employee> t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		for(Employee e: t)
		{
			System.out.println(e);
		}
		
	}
}
