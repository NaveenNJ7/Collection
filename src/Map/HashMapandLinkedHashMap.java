package Map;

import java.util.HashMap;

public class HashMapandLinkedHashMap {
	
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		
		// put() used to add key and value to the Map
		h.put("Ram", 10);
		h.put(20, "Manju");
		h.put("Mango", 20);
		h.put(25, "Manju");          //size() is 7 but duplicate will remove
		h.put(35, 45);
		h.put(20, "duplicate");  // 20-Manju and 20-duplicate - so it wont allow)
		h.put(10, "Manju");      // 25-Manju and 10-Manju - (Manju) are duplicate, it will allow)
		                         // only key duplicates wont allow
		
		
		// Map overridden toString() 
		/*
		 1) insertion order does not maintain
		 2) Duplicate key not allowed and duplicate value allow
		 */
		System.out.println(h+"   "+h.size());
		System.out.println("-------------------");
		
		//get() used get the object based on the key specified
		System.out.println(h.get("Ram"));
		System.out.println(h.get(20));
		System.out.println(h.get(100)); // null is the output, no 100 key present
		System.out.println("-------------------");
		
		// containsKey() used to check key is present or not
		System.out.println(h.containsKey(20));
		System.out.println(h.containsKey("John"));
		System.out.println("-------------------");
		
		// containsValue used to check value is present or not
		System.out.println(h.containsValue("Manju"));
		System.out.println(h.containsValue("John"));
		System.out.println("-------------------");
		
		// remove() used to remove a value based on the key specified
		System.out.println(h);
		h.remove(35);
		System.out.println(h);
		System.out.println("-------------------");
		
		// isEmpty() used to check if the Map is empty or not
		System.out.println(h.isEmpty());
		
		// clear() used to remove all the objects from Map
		h.clear();
		System.out.println(h.isEmpty());
		
		
		
		
		
	}

}
