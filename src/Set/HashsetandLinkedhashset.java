package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetandLinkedhashset {

	
	
	public static void main(String[] args) {
		
		//Hashset
		HashSet s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);    // size() is = 7 but it removes duplicates and size() is 5
		s.add(40);
		s.add("java");
		s.add(20);      // 20 and 10 are duplicates
		s.add(10);
		
		//it does not maintain insertion order and duplicates not allowed
		// the objects how we add to collection in particular order, the same way if it will not print
		// 10 and 20 are duplicates
		System.out.println("Does not maintain the insertion order and duplicates not allowed :"+s);
		System.out.println("Size "+s.size());
		for(Object i: s)
		{
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		// LinkedHash set
		
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(40);
		
		
		// it maintains insertion order and duplicates not allowed
		// the objects how we add to collection in particular order, the same way if it will print
		// combination of linked and hashset
		
		System.out.println("It maintains the insertion order and duplicates not allowed :"+l);
		for(Integer t: l)
		{
			System.out.println(t);
		}
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		
		h.add("java");
		h.add("mava");
		h.add("Easy");
		h.add("python");
		h.add("Java");  // capital J, it will print and not duplicate
		h.add("java");
		
		System.out.println(h);
		
		for(String n: h)
		{
			System.out.println(n);
		}
		
		
	}
	
}
