package Storingojbects;

import java.util.ArrayList;

public class Student {

	// Overriding toString()
	
	String name;
	int std;
	
	Student(String name, int std)
	{
		this.name = name;
		this.std = std;
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+" and Class :"+std;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Ram", 9);
		Student s2 = new Student("Sham", 9);
		Student s3 = new Student("Bhama", 9);
		
		// storing objects into arraylist
		
		ArrayList<Student> l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(new Student("Nav", 10));
		l.add(new Student("Navin", 10));
		
		/*
		  here overridng toString() so if we print s, it will fetch objects of student one bye one 
		  instead of string representation
		 */
		System.out.println("Student details");
		for(Student s: l)
		{
			System.out.println(s);
		}
		
		
		
	}
	
	
}
