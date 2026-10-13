package Set;

public class Comparemethod {
	
	
	
	public static void main(String[] args) {
		
		// Comparison method, 
		
		String s = "A";
		String g = "B";
		// String i = "C";
		
		// ASCII value A=65, B=66, C=67
		System.out.println(s.compareTo(g)); // -1
		System.out.println(g.compareTo(s)); // +1
		System.out.println(s.compareTo(s)); // 0
	//	System.out.println(s.compareTo(i)); // giving -2, google it
		
		System.out.println("-------------");
		// int x = 20; int is primitive type data, it does not implement comparison()
		
		Integer x = 10;
		Integer y = 40;
		Integer z = 60;
		
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		System.out.println(x.compareTo(x));
		System.out.println(x.compareTo(z));
		System.out.println(z.compareTo(y));
		
		System.out.println("-------------");
		
		Double d = 10.5;
		Double e = 30.5;
		Double l = 45.5;
		
		System.out.println(d.compareTo(e)); // -1
		System.out.println(e.compareTo(d)); //+1
		System.out.println(d.compareTo(d)); // 0
		System.out.println(d.compareTo(l)); // -1
		System.out.println(e.compareTo(l)); // -1
		
		System.out.println("-------------");
		
		String m = "c";
		String n = "e"; 
		// only in String it is not giving -1,1 and 0, when value is not consecutive
		// value if a and b, then its giving -1,1,0
		System.out.println(m.compareTo(n));
		System.out.println(n.compareTo(m));
		System.out.println(m.compareTo(m));
		
		
		
	}

}
