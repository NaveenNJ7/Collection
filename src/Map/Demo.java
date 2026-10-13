package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	
	public static void main(String[] args) {
	
		// int is primitive type, map and collection does not support primitive type
		HashMap<Integer, String> m = new HashMap();
		
		m.put(14, "Mango");
		m.put(8, "Watermelon");
		m.put(20, "Apple");
		
		// we can not traverse pair of key and value, so covert it to set of keys by using keySet()
	  Set<Integer> f = m.keySet();		
	  
	  // traverse it now
	  // does not maintain insertion order
	  for(Integer i: f)
	  {
		  System.out.println(i+" "+m.get(i));
	  }
		
	  System.out.println("--------------");
	  
	  
		LinkedHashMap<String, Integer> h = new LinkedHashMap();
		
		h.put("Vishal", 21);
		h.put("Sunil", 18);
		h.put("Gaju", 22);
		
		Set<String> p = h.keySet();
		
		// maintain insertion order
		
		for(String key: p)
		{
			System.out.println(key+" "+h.get(key)); // instead of key we can give any name also
		}
		
		System.out.println("--------------");
		
		// sort it based on key 
		TreeMap<Integer, String> t = new TreeMap();
		
		t.put(14, "John");
		t.put(12, "Curt");
		t.put(16, "Brook");
		
		Set<Integer> s = t.keySet();
		
		for(Integer key: s)
		{
			System.out.println(key+" "+t.get(key));
		}

		
		
		
	}
	
}
