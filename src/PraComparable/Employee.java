package PraComparable;

public class Employee implements Comparable<Employee> {

	String name;
	int id;
	Double salary;
	
	public Employee(String name, int id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Name : "+name+"\nId : "+id+"\nSalary : "+salary;
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return this.name.compareTo(e.name);
	} 
	
	
/*	@Override
	public int compareTo(Employee e) {
		
		return this.id-e.id;
	}  */
	
	
	/*
	 here this return (int) (this.salary-e.salary);
	 will sort only non decimal values like 58.55, 68.55 it will minus only 68-58, it wont consider decimal
	 if in order to consider decimal values 58.55 also we need to call compareTo() from Double, so the 
	 variable we declared at class level must be Double. if we write only double we can not access compareTo()
	 method, because it present in wrapper class Double, Integer, String.
	 
	 if non decimal values are same and decimal are not same that if we use (int) (this.salary-e.salary);
	 55.45, 55.35, 55.25, 55.15
	 it will print only one number because it treats 55 non decimal is duplicate values.
	 so if want to consider whole number 55.45 including decimal we must call compareTo() from Double
	 */
	
/*	@Override
	public int compareTo(Employee e) {
		
		return (int) (this.salary-e.salary);
	}   */
	
/*	@Override
	public int compareTo(Employee e) {
		
		return this.salary.compareTo(e.salary);
	} */
	
	
	
}
