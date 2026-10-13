package Comparatorinterface;

import java.util.TreeSet;

public class Student {
	
	
	String name;
	int age;
	
	Student(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Name :"+name+" age :"+age;
	}
	
	
	public static void main(String[] args) {
		
		
		Student s1  = new Student("Pavan", 15);
		Student s2 = new Student("Kiran", 16);
		Student s3 = new Student("Pradeep", 14);
		Student s4 = new Student("Nikhil", 15);
		
		Sortbyage ag = new Sortbyage();
		Sortbyname nam = new Sortbyname();
		
		TreeSet<Student> t = new TreeSet(ag);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(new Student("Arun", 14));
		t.add(new Student("Gaju", 13));
		
		for(Student o:t)
		{
			System.out.println(o);   // 13,14p,15p,16 output and 14 and 15 are duplicates
		}
		
		/*
		 if students have different but have same age, but in TreeSet it will not allow duplicate
		 but we want to print all student name with age sort, how check this one
		 */
	}
	
	
	
	
	

}
