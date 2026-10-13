package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	
	public static void main(String[] args) {
		
		/*
		 duplicates not allowed, not maintain insertion order
		 */
		HashSet hs=new HashSet();
		System.out.println("Hash Set objects");
		hs.add(50);
		hs.add(30);
		hs.add(10);
		hs.add(40);
		hs.add(20);
		hs.add(10);
		hs.add(50);
		
		System.out.println(hs);
		
		/*
		 insertion order maintain, duplicates not allowed
		 */
		
		LinkedHashSet<Object> lh=new LinkedHashSet();
		
		lh.add("Java");
		lh.add(45);
		lh.add(20.55);
		lh.add(45);
		lh.add(null);
		lh.add('J');
		lh.add("Java");
		
		System.out.println("Linked hash set objects");
		System.out.println(lh);
		
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(50);
		ts.add(30);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		ts.add(50);
		
		/*
		 Default sorting - natural sorting - Ascending
		 */
		System.out.println("Tree set Objects");
		System.out.println(ts);
	}
}
