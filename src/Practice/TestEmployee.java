package Practice;

import java.util.TreeSet;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("John",25);
		Employee e2 = new Employee("Cena",15);
		Employee e3 = new Employee("Angle",35);
		
		TreeSet<Employee> t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(new Employee("Kurt",05));
		t.add(new Employee("Booker",45));
		
		for(Employee el: t) {
			System.out.println(el);
		}
		
		
	}
}
