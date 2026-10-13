package ConstructorinList;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {

	
	public static void main(String[] args) {
		
		
		/*Constructors present in List
		 1) ArrayList a = new ArrayList();
		 2) ArrayList A = new ArrayList(int initial capacity);
		 3) ArrayList A = new ArrayList(Collection c);
		 
		 1) LinkedList l = new LinkedList();
		 2) LinkedList(Collection c)
		 
		 1) Vector v = new Vector();
		 2) Vector v = new Vector(int initial capacity);
		 3) Vector v = new Vector(int initailcapacity, int initial increment);
		 4) Vector(Collection c)
		 */
		
		
		/*
		 here when we creat object of ArrayList, internally it will call constructor 
		 of default capacity is 10 and incremental capacity of (cc*3)/2+(1)
		 */
		ArrayList a = new ArrayList();
		
		/*
		  here if we pass 20, it indicates explicitly we are telling initial capacity is 20
		 */
		ArrayList A = new ArrayList(20);
		
		/*
		 default capacity is 10 and incremental capacity is(cc*2)
		 */
		Vector v = new Vector();
		
		/*
		 here we are passing initial capacity of 20 and incremental capacity is default that 
		 is (cc*2)
		  */
		Vector V = new Vector(20);
		
		/*
		 here 10 is initial capacity and 5 is incremental capacity
		 
		 */
		Vector vv = new Vector(10, 5);
	}
	
	
	
}
