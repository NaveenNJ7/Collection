package Wrapperclass;

public class Demo {

	
	public static void main(String[] args) {
		
		// all wrapper classes are p-d-c in java.lang package
		// overridden toString()
		
		// way of representing primitive data type
		int a = 10;
		System.out.println(a);
		
		// representing non primitive data type
		
		Integer i = new Integer(10); // we can pass a also
		System.out.println(i);
		System.out.println(a+" "+i);
		
		System.out.println("---------");
		
		double d = 10.5;
		System.out.println(d);
		
		Double b = new Double(d); // we can pass 10.5 also
		System.out.println(b);
		System.out.println(d+" "+b);
		
		System.out.println("------");
		
		char c = 'z';
		System.out.println(c);
		
		Character r = new Character('z');
		System.out.println(r);
		System.out.println(c+" "+r);
		
		Integer m = new Integer(20);
		System.out.println(m);
		
		int n = m;
		System.out.println(n);
		System.out.println(m+" "+n);
		
		System.out.println("--------");
		
		Character h = new Character('U');
		System.out.println(h);
		
		char g = h;
		System.out.println(g);
		System.out.println(h+" "+g);
		
		
		
	}
	
	
	
	
}
