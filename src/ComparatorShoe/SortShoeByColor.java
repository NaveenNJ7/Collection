package ComparatorShoe;

import java.util.Comparator;

public class SortShoeByColor implements Comparator<ShoeStore> {

	
	@Override
	public int compare(ShoeStore x, ShoeStore y)
	{
		return x.color.compareTo(y.color);
	}
	
}

/*
return x.color.compareTo(y.color);
here String implements comparable and override compareTo()
*/