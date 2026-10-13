package Map;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap(); // only wrapper class will allow
		hm.put(10, "Postman");
		hm.put(5, "Rest assured");
		hm.put(20, "MySQL");
		hm.put(15, "TestNG");
		
		System.out.println(hm);
		
		Set<Integer> s = hm.keySet();
		
		for(int h : s)
		{
			System.out.println(hm.get(h));
		}
		
	}
}
