package Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Double> lh = new LinkedHashMap<String, Double>();
		lh.put("Mahesh", 755.5);
		lh.put("Balaji", 555.5);
		lh.put("Lokesh", 855.5);
		lh.put("Jeeva", 655.5);
		
		// maintains insertion order

		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		// s has only keys, using get(key) - we can get value
		
		for(String h: s)
		{
			System.out.println("Key is : "+h+" and value is : "+lh.get(h));
		}
		
	}
}
