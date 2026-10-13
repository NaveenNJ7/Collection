package ComparatorShoe;

public class ShoeStore {

	String brand;
	double price;
	String color;
    int size;
    
    ShoeStore(String brand, double price, String color, int size)
    {
    	this.brand=brand;
    	this.price=price;
    	this.color=color;
    	this.size=size;
    }
    
    @Override
    public String toString()
    {
    	return "Shoe Brand :"+brand+"\nPrice :"+price+"\nColour :"+color+"\nSize"+size;
    }
}
