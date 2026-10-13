package Comparableinterface;

import java.util.TreeSet;

public class Student implements Comparable<Student> {

	String name;
	int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;       // alt+shit+s generate constructors
	}
	
	@Override
	public String toString()
	{
		return "Name :"+name+" Age :"+age;
	}
	
	/* @Override
	public int compareTo(Student s)
	{
		// for string comparison we need to call compareTo() from String class
		return this.name.compareTo(s.name);
	} */
	
	@Override
	public int compareTo(Student s)
	{
		return this.age-s.age;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Pattu", 15);
		Student s2 = new Student("Pritu", 14);
		Student s3 = new Student("Chimmi", 4);
		
		TreeSet<Student> t = new TreeSet<Student>();
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student o: t)
		{
			System.out.println(o);
		}
		
		
	}
	
	
	
	
	
	
}
