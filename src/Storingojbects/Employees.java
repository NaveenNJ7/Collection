package Storingojbects;

public class Employees {

	// String overridden
	
	String name;
	int id;
	
	Employees(String name, int id)
	{
		this.name = name;
		this.id= id;
	}
	
	public String toString()
	{
		return "Name :"+name+" Id :"+id;
	}
	
}
