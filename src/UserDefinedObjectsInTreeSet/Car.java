package UserDefinedObjectsInTreeSet;

public class Car implements Comparable<Car> {

	// since Comparable interface has abstract method compareTo() so override it
	int cost;
	
	Car(int cost)
	{
		this.cost=cost;
	}
	
	@Override
	public String toString()
	{
		return "Cost :"+cost;
	}
	
	@Override
	public int compareTo(Car c)
	{
		return this.cost-c.cost;
	}
	
}
