package Storingojbects;

import java.util.ArrayList;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employees  e1 = new Employees("Surekha", 35);
		Employees  e2 = new Employees("Malini", 30);
		Employees  e3 = new Employees("Nandish", 5);
		
		ArrayList<Employees> a = new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		for(Object e: a)
		{
			System.out.println(e);
		}
		
	}
}
