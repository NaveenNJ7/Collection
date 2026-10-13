package SDETPavan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	
/*

 insertion order and index not followed, duplicates not allowed
 key and value pair. key+value=entry
 
*/
	
	public static void main(String[] args) {
		
	//	Map<Integer, String> m = new HashMap();
		
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(10, "Parve");
		hm.put(5, "Sami");
		hm.put(30, "Ramesh");
		hm.put(10, "Parvez"); // this will overridden Parve becoz same key used
		hm.put(40, "Ramesh"); // value Ramesh is same in 30 & 40 but still it print, only key should not same
		hm.put(20, "Suresh");
		hm.put(50, "Sarvesh");
		
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.get(30));
		System.out.println(hm);
		System.out.println(hm.remove(50));
		System.out.println(hm);
		
		for(int k: hm.keySet())
		{
			System.out.println("Key : "+k+" value : "+hm.get(k));
		}
		
		
		Iterator<Entry<Integer, String>> it= hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
