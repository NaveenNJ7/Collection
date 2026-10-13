package ComparatorShoe;

import java.util.Comparator;

public class SortShoeByBrand implements Comparator<ShoeStore> {

	
	@Override
	public int compare(ShoeStore x, ShoeStore y)
	{
		return x.brand.compareTo(y.brand);
	}
	
	//here we are calling String class, which implements comparable interface and override toString
}
