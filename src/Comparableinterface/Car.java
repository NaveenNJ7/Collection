package Comparableinterface;

import java.util.TreeSet;

public class Car implements Comparable<Car> {
	
	
	// overriding both toString() and making object as Comparable interface
	
	int cost;
	
	Car(int cost)
	{
		this.cost = cost;
	}
	
	@Override
	public String toString()
	{
		return "Cost :"+cost;
	}
	
	@Override
	public int compareTo(Car c)
	{
		return this.cost-c.cost;
	}
	
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car(100);
		Car c2 = new Car(300);
		Car c3 = new Car(500);
		
		// create TreeSet for sorting car cost
		
		TreeSet<Car> t = new TreeSet();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(new Car(400));   // it will remover duplicates
		t.add(new Car(200));
		t.add(new Car(100));
		
		/* when we add objects to TreeSet internally it calls the compareTo() for 
		   sorting the objects, here there is no compareTo() present in the Car class
		   so override the compareTo().
		   
		   Steps to override compareTo()
		   1. Class should implements the Comparable interface
		   2. specify the generic of type of objects which we compare
		   3. override the abstract() that is compareTo()
		 */
		
		System.out.println("Objects stored in TreeSet :"+t);
		
		for(Car o: t)
		{
			System.out.println(o);
		}
		
		
		
		
		
		
		
	}
	

}
