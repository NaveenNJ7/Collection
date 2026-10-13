package SDETPavan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

/*

	Homogeneous, insertion and index not followed, duplicates not allowed, single null allowed
	
	remove(object), for each loop, insertion not possible, 
	
	
	
*/
	public static void main(String[] args) {
		
		//Set<Integer> s = new HashSet<Integer>();
		HashSet hs = new HashSet();
		hs.add(50);
		hs.add(40);
		hs.add("Pavan");
		hs.add(60);
		hs.add(20.5);
		hs.add(30);
		hs.add(null);
		hs.add("Pavan"); 
		hs.add(40);
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.remove(null)); //pass direct value, not index base so
		System.out.println(hs);
		
		System.out.println("-------------------");
		
		for(Object obj: hs)
		{
			System.out.println(obj);
		}
		
		System.out.println("-------------------");
		
		// with using index concept how to access element
		// convert set into list
		ArrayList  al = new ArrayList(hs);
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("-------------------");
		
		//using iterator
		
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		
		
		/*
	
					        hasNext()
           						↓
     					Is there another
        					element?
       						↙       ↘
    					 YES         NO
     					 ↓           ↓
  						true         false
     					 ↓
   					  next()
     					↓
 				returns element
 				and moves cursor
	
	
	
		 */
		
		
		
		
		
		
		
	}
	
}
