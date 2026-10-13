package FOREACHANDGENERICS;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoGeneric {

	
    public static void main(String[] args) {
		
    	/* usually collection are heterogeneous,suppose if we specify generic then
    	   it will allow only generic type elements    */
    	
    	//allows only string data type 
    	ArrayList<String> a = new ArrayList<String>();
    	a.add("java");
   // 	a.add(10);   --> gives error because its integer
    	a.add("sql");
    	a.add("rest assured");
    	
    	// for each loop
    	for(String s:a)
    	{
    		System.out.println(s);
    	}
    	
    	
    	// here we cant write only int, because its collection, collection support only non primitive
    	LinkedList<Integer> l = new LinkedList(); 
    	l.add(10);
    	l.add(30);
    	l.add(45);
    	
    	for(int z:l)  // here we can write int also, because its for loop  
    	{
    		System.out.println(z);
    	}
    	
    	
    	//Object is supermost class all classes in java inherits Object class
    	
    	ArrayList x = new ArrayList();
    	x.add("Postman");
    	x.add(4.45);
    	x.add(10);
    	x.add(null);
    	x.add('A');
    	
    	/* suppose if we want to use for each loop we need to write data type of traverse
    	 but here ArrayList contains heterogeneous so all classes in java inherits Object class
    	 so we can write Object as traverse data type 
    	 */
    	
    	for(Object o:x)
    	{
    		System.out.println(o);
    	}
    	
	}
}
