package UserDefinedObjectsInTreeSet;

import java.util.TreeSet;

public class TestCar {

	public static void main(String[] args) {
		
		Car c1 = new Car(400);
		Car c2 = new Car(300);
		Car c3 = new Car(500);
		
		TreeSet<Car> t = new TreeSet();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car o:t)
		{
			System.out.println(o);
		}
		
	}
}
