package ComparatorShoe;

import java.util.TreeSet;

public class SortShoeStore {

	
	public static void main(String[] args) {
		
		ShoeStore s1 = new ShoeStore("Puma", 1500.55, "white", 7);
		ShoeStore s2 = new ShoeStore("Nike", 1500.75, "Black", 9);
		ShoeStore s3 = new ShoeStore("Reebok", 1500.45, "Blue", 6);
		ShoeStore s4 = new ShoeStore("Sketchers", 1500.65, "Cream", 5);
		
		SortShoeByBrand brand = new SortShoeByBrand();
		SortShoeBySize size = new SortShoeBySize();
		SortShoeByColor color = new SortShoeByColor();
		SortShoeByPrice price = new SortShoeByPrice();
		
		
		TreeSet<ShoeStore> t = new TreeSet(price);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(new ShoeStore("Deckthalon",3000,"Ash",8));
		
		for(ShoeStore s: t)
		{
			System.out.println(s);
		}
	}
}
