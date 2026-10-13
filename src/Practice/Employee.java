package Practice;

public class Employee implements Comparable<Employee>{

	// compareTo()
	
	String name;
	int id;
	
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		
		return "Name of Employee : "+name+" id : "+id;
	}
	
	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
	
}
