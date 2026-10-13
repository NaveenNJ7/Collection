package Map;

import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap();
		
		tm.put("Vinayak", 26);
		tm.put("Sagar", 23);
		tm.put("Prajwal", 22);
		tm.put("Manthu", 25);
		
		//it maintains sorting order
		
		Set<String> s = tm.keySet();
		
		System.out.println(tm);
		
		for(String t: s)
		{
			System.out.println(t+" : age is s : "+tm.get(t));
		}
		
	}
}
