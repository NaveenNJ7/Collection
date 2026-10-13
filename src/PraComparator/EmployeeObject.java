package PraComparator;

import java.util.TreeSet;


public class EmployeeObject {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 11, 65405.9785);
		Employee e2 = new Employee("BookerT", 8, 35405.6685);
		Employee e3 = new Employee("Cena", 15, 25405.5355);
		
		EmployeeSortingByName sortName=new EmployeeSortingByName();
		EmployeeSortBySalary sortSalary=new EmployeeSortBySalary();
		
		
		TreeSet<Employee> t=new TreeSet(sortSalary);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(new Employee("UnderTaker",5,55405.2563));
		
		for(Employee l: t) {
			System.out.println(l);
			System.out.println("-----------------");
		}
	}
}
