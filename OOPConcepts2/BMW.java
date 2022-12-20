package OOPConcepts2;

public class BMW extends Car { // "has-a relationship"
	
	// when a method is present in parent class as well as child class with the same name and -
	// - same number of arguments, it is called Method Overriding 
	
	public void start() { //overridden method
		System.out.println("BMW----start");
	}
	
	public void theftSafety() {
		System.out.println("BMW----theftSafety");
	}

}
