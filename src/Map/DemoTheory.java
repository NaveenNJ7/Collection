package Map;

public class DemoTheory {

	
	/*
	 * Map is a pre defined interface present in java.util package
	 * Introduced from jdk 102
	 * Map is part of collection framework but does not extends Collection interface
	 * In map data organized in form of key and value pair
	 * pair of key and value together called entry
	 * Map is collection of entries
	 
	   key can not be duplicate
	   value can be duplicate
	   
	  * Implement classes of Map are
	  1) HashMap
	  2) LinkedHashMap
	  3) TreeMap
	  4) HashTable 
	  
	  Method present in Map are
	  1) put() -> used to add objects into map
	     we can not use add() because it is present in Collection interface but Map does not
	     extends Collection so it can not inherit
	     
	  2) get() -> used to get object based on key 
	  3) containsKey()
	  4) containsValue()
	  5) isEmpty()
	  6) clear()
	  7) remove()
	  8) keySet()   
	  
	  
	  HashMap
	  * pdf - C java.util package and introduced from jdk 1.2
	  * Does not maintain insertion order
	  * underlined data structure is HashTable
	  
	  LinkedHashMap
	  * pdf - C java.util package and introduced from jdk 1.2
	  * It maintains insertion order
	  * Underlined data structure is Linked and HashTable
	  
	  TreeMap
	  * pdf - C java.util package and introduced from jdk 1.2
	  * It maintains sorting order
	  * underlined data structure is binary tree
	   
	 
	  Since object stored in key and value pair we cant use directly for each loop
	  so first convert it into set of keys and it return Set 
	  Now use for each loop fetch each key and using get() it will fetch object
	  
	  

	 */
}
