package Map;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> t = new TreeMap();
		
		t.put("Milk", 20);
		t.put("Butter", 35);
		t.put("Ghee", 15);
		
		Set<String> s = t.keySet();
		
		for(String k: s)
		{
			System.out.println(k+" "+t.get(k));
		}
		
		System.out.println("-----------");
		// if TreeMap has duplicate key, the older value will get overridden
		
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		
		m.put(2, "T");
		m.put(1, "D");
		
		System.out.println(m);
		
		// T overridden by C
		m.put(2, "C");
		
		System.out.println(m);
		
	}
}
