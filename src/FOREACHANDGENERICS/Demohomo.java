package FOREACHANDGENERICS;

public class Demohomo {

	
	
	public static void main(String[] args) {
		
		int[] a = {10,20,40,30};
		
		// using for loop
		
		System.out.println("Using for loop");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		// using for each loop, this is more efficiency than for loop
		
		/*
		 syntax
		         for(datatype of traversing   traversing variable : Array or collection name)
		         {
		         
		         }      	 
		 */
		
		System.out.println("Using for each loop");
		for(int t: a)
		{
			System.out.println(t);
		}
		
		
		System.out.println("------------");
		
		double[] percentage = {80.5, 90.5, 75.5};
		
		for(double d: percentage)
		{
			System.out.println(d);
		}
		
		System.out.println("-------------");
		
		String[] fruits = {"Mango", "Watermelon","Banana"};
		
		for(String f: fruits)
		{
			System.out.println(f);
		}
		
		
	}
	
	
	
	
	
	
}
