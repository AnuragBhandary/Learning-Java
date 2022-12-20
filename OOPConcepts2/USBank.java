package OOPConcepts2;

public interface USBank { // in interface we only declare the method, we don't write the method body
	
	int min_bal = 100;
	
	//only method prototype
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// in interface, we can declare variables, variables are by default static in nature
	// value of variables will not be changed
	// no static method in interface
	// no main method in interface
	// we cannot create the object of interface - interface is abstract in nature
	//
	
	

}
