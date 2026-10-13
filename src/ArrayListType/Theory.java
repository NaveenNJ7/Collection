package ArrayListType;

public class Theory {

	/*
	 Data structure - it is a way of arranging or organizing or storing data in particular order
	 
	 Some type of data structures are
	 Stack, Queue, ArrayList, HashTable, Tree etc
	 
	* Variable - it is a container stores single object
	 
	* Array - container stores group of objects of same data type [Homogeneous]
	 
	* Collection - container used to store group of objects of same or different data type
	 			   homogeneous and heterogeneous
	 			  
	 Array									collection
	 -----									-----------
	 
	 stores homogeneous objects				Heterogeneous
	 
	 Fixed in size 							Dynamic in size
	 
	 Does not have any methods				It have methods
	 
	 Does not support generic				support generic
	 
	 
	 Collection is interface which internally implements iterable
	 
	 1) List, 
	 2) Queue 
	 3) Set 
	 are interfaces which extends Collection
	 
	 List 
	 -> which is extends by four classes
	 Arraylist
	 Stack
	 Vector
	 LinkedList
	 
	 Queue
	 -----
	 -> which extends by two classes
	 LinkedList
	 Priority Queue
	 
	 Set
	 ---
	 ->which is implemented by class
	 HashSet
	 which is extended by class
	 LinkedHashSet
	 
	 -> set Extended by two interfaces
	 Stored set
	 Extended by
	 Navigable set
	 
	 Navigable implemented by class
	 Treeset
	 
	 List 
	 -------------------
	 Pre defined interface present in java.util package
	 
	 - Specifications
	 
	 Maintains insertion order
	 Index based
	 Allows duplicate objects
	 Allows null 
	 
	 ArrayList
	 ---------
	 Pre defined class present in java.util package
	 
	 Which follows all specifications of list
	 
	 Initial capacity of array is 10
	 
	 Incremental capacity is   (current capacity*3)/2+1
	 
	 underlined data structure - resizeable array or growable array
	 
	 when we create an object of arraylist
	 ArrayList l = new ArrayList();
	 
	 size of 10 index positions of array will create
	 when we keep on adding objects if all positions full,if we add objects then
	 new array will create with size of incremental capacity
	 (10*3)/2+1 = 16 index positions will create
	 reference l starts to pointing towards new array
	 
	 
	 Pre defined Methods present in Collection interfaces
	 ------------------
	 since collection is interface so contains abstract methods
	 
	 1) add()
	 2) addAll()
	 
	 3) remove()
	 4) removeAll()
	 
	 5) contains()
	 6) containsAll()
	 
	 7) isEmpty()
	 8) clear()
	 
	 9) size()
	 10) iterator()
	 
	 
	 Pre defined methods present in List interface
	 1) get()
	 2) set(index,object)
	 3) add(index, object)
	 4) indexOf()
	 5) lastIndexOf()
	 
	 
	 
	
	 */
	
}
