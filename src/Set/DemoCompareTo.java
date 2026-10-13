package Set;

public class DemoCompareTo {

	/*
	 here if we are using compareTo() means we should use only wrapper classes
	 non primitive data type
	 */
	
	public static void main(String[] args) {
		
	/*	int a=10;
		int b=20;   // int is keyword not wrapper class or non primitive type, so it gives error
		
		System.out.println(a.compareTo(b));  */
		
		Integer a=10;  // since it is wrapper class we can use compareTo()
		Integer b=20;
		
		System.out.println(a.compareTo(b)); //-1
		System.out.println(b.compareTo(a)); //+1
		System.out.println(a.compareTo(a)); //0
		
		/*
		 Return values:

		0 → Both objects are equal.
		Negative value → object1 is smaller than object2.
		Positive value → object1 is greater than object2.
		
		Explanation
		10.compareTo(20) → 10 < 20 → -1
		20.compareTo(10) → 20 > 10 → 1
		10.compareTo(10) → Equal → 0
		 */
		
		
		String s="A"; //ASCI value 65
		String t="B"; // 66
		System.out.println(s.compareTo(t)); //-1
		System.out.println(t.compareTo(s)); //+1
		System.out.println(s.compareTo(s)); //0
		
		Character x='A';
		Character y='D';
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		
		/*
		 Character.compareTo() returns the actual difference between the two Unicode values,
		 not just whether one is smaller or larger. 
		 
		 Integer.compareTo() is implemented differently. It checks 
		 the relationship between the numbers:
		
		 Class			Possible Return Values
		 -----			-------------------
		Integer			-1, 0, 1 (effectively based on comparison)
		String			Any negative or positive integer (difference between first unequal characters)
		Character		Difference between Unicode values
		 */
				
	}
	
	
	
	
	
}
