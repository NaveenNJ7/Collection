package Comparableinterface;

public class Demo {
	
	
	String name;
	
	Demo(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Name of person :"+name;
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo("Vinnu");
		System.out.println(d);      // fully qualified class name @hashcode of object
		
		/*when we print object reference internally it calls toString(),
		   here there is no toString(), so override it
		   if we want actual content we passed, we need to override the toString()
		 */
	     
		
		/*
		  all wrapper classes and String class override the toString()
		 */
		
		String s = new String("Shri");
		System.out.println("Stirng override toString() :"+s);
		
		Integer i = new Integer(10);
		System.out.println("Wrapper class override toString() :"+i);
		
		
		
		
		
	}
	
	

}
