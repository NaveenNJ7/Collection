package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("Pavan");
		l.add(10);
		l.add(20.05);
		l.add('J');
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.contains("Pavan"));
		
		System.out.println(l.size()); // 6
		
		System.out.println(l.get(2)); // 10
		
		System.out.println(l.indexOf(null)); // 5
		
		System.out.println(l.lastIndexOf(10)); // 2  there are two 10, last 10 index number is 2
		
		System.out.println("=======");
		System.out.println("Normal for loop");
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("=======");
		System.out.println("For each loop");
		
		// here ArrayList contains heterogeneous so Using Data type is Object
		for(Object i:l) {
			System.out.println(i);
		}
		System.out.println("=======");
		System.out.println("Iterator");
		
		Iterator<Object> i= l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
