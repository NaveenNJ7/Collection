package ComparatorShoe;

import java.util.Comparator;

public class SortShoeByPrice implements Comparator<ShoeStore> {

	
	public int compare(ShoeStore x, ShoeStore y)
	{
		return Double.compare(x.price, y.price);
	}
	
	
}
/*
 return (int)(x.price - y.price);
 
 we can write this but sorting is based on non decimal numeric values example
 1500.75
 1500.55
 1500.00
 1500.99
 3000.00
 
 Result will be -> 1500.75 and 3000.00 because it compares only non decimal numeric
 here non decimal 1500 which is duplicates so only 1500.75 will print
 so in order to avoid use 
 return x.price.compareTo(y.price);  --> for this we should make price variable should be 
 wrapper class that is Double
 
 
 return Double.compare(x.price, y.price);
 this will give +1, -1, 0 results based on that objects will display for this we no need to change
 variable data type
 
 
 
 
 */
