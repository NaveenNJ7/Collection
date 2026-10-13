package ConstructorinList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Storing {

	
	public static void main(String[] args) {
		
	
		
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		System.out.println(a);
		System.out.println("--------");
		
		LinkedList l = new LinkedList(a);
		System.out.println("adding objects of ArrayList into linkedList l");
		System.out.println(l);
		l.add(30);
		l.add(40);
		System.out.println(l);
		System.out.println("--------");
		
		Vector v = new Vector(l);
		System.out.println("adding objects of LinkedList into Vector");
		System.out.println(v);
		v.add(50);
		v.add(60);
		System.out.println(v);
		
		
		
		
	}
	
	
}
