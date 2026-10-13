package ComparatorShoe;

import java.util.Comparator;

public class SortShoeBySize implements Comparator<ShoeStore> {

	
	@Override
	public int compare(ShoeStore x, ShoeStore y)
	{
		return x.size-y.size;
	}
	
	/*
	   return x.size.compareTo(y.size);
	   if we return this,  variable the size should have data type Integer (wrapper class)
	   change data type of variable from int to Integer in ShoeStore class
	   because Integer class override compareTo();
	   
	 */
	
}
