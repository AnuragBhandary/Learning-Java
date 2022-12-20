package OOPConcepts2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism OR compile time polymorphism 
		// polymorphism means one to many
		// this is just a random comment
		BMW b = new BMW();
		b.start(); // If child class and parent class have same method, child class will be given preference.
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		// Dynamic polymorphism OR Run time polymorphism
		// Child class object can be referred by parent class reference variable
		// Only overridden methods and parent class methods can be accessed
		
		// Top Casting
		Car c1 = new BMW(); 
		c1.start();
		c1.stop();
		c1.refuel();
		// c1.theftSafety -- Not accessible as it is child class method
		
		// Down Casting -- Not allowed
		// BMW b1 = (BMW)new Car(); ---- Error ClassCastException
		
		

	}

}
