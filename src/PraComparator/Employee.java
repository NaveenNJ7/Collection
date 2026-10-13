package PraComparator;

public class Employee {
	
	String name;
	int id;
	Double salary;
	
	public Employee(String name, int id, Double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Name : "+name+"\nId : "+id+"\nSalary : "+salary;
	}
	
	

}
