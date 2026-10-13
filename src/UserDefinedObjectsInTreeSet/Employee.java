package UserDefinedObjectsInTreeSet;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) 
	{
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+" Id :"+id+" Salary :"+salary;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return Integer.compare(this.id, e.id);
	}   
	
	
/*	@Override
	public int compareTo(Employee e)
	{
		return this.name.compareTo(e.name);
	}
	   */
	
/*	@Override
	public int compareTo(Employee e)
	{
		return Double.compare(this.salary,e.salary);
	}
	
	*/
	
	
}
