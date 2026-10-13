package Map;

import java.util.HashMap;
import java.util.Set;

public class DemoMethods {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(10, "Vinod");
		hm.put(5, "Jay");
		hm.put(20, "Arun");
		hm.put(15, "Pravin");
		hm.put(30, "Zeeshan");
		
		System.out.println(hm);
		
		//get() -> used to get value based on key
		System.out.println(hm.get(5)); //jay
		
		//containsKey() -> used to check key is present or not
		System.out.println(hm.containsKey(20)); //true
		
		//containsValue()
		System.out.println(hm.containsValue("Pravin")); //true
		System.out.println(hm.containsValue("jay")); // false case sensitive its Jay
		
		//remove() -> used remove key and value based on key
		System.out.println(hm);
		hm.remove(30);
		System.out.println(hm); // removed 30=Zeeshan
		
		//KeySet() -> contains only keys
		Set<Integer> s = hm.keySet();
		
		for(int i: s)
		{
			System.out.println(i); //hm.get(i) gives value of key
		} 
		
		System.out.println(hm.isEmpty()); // false
		
		hm.clear();  // removed all keys and objects
		
		System.out.println(hm.isEmpty()); // true
		
		
	}
	
	
}
