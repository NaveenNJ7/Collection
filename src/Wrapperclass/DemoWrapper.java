package Wrapperclass;

import java.util.ArrayList;

public class DemoWrapper {

	
	public static void main(String[] args) {
		
		// primitive way of representing
		int a = 10;
		
		// non primitive way of representing
		Integer i = new Integer(10);
		
		Double b = new Double(20.5);
		
		//Auto boxing primitive to non primitive
		int x = 20;
		Integer y = new Integer(x);
		
		System.out.println(x+" "+y);
		
		double m = 20.5;
		Double n = new Double(m);
		
		System.out.println(m+" "+n);
		
		
		// Auto unboxing non primitive to primitive
		Integer p = new Integer(15);
		int q = p;
		
		System.out.println(p+" "+q);
		
		Character c = new Character('C'); 
		char r = c;
		
		System.out.println(c+" "+r);
		
		
		//-----------------------------------
		int o = 10;
		double e = 50.5;
		char k = 'A';
		
		ArrayList al = new ArrayList();
		al.add(o); // al.add(new Integer(10)); auto boxing -> converts automatically
		al.add(e); // al.add(new Double(50.5));
		al.add(k); // al.add(new Character('A'));
		
		System.out.println(al);
	}
	
	
	
	
	
}

