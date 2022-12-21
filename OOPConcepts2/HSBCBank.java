package OOPConcepts2;

public class HSBCBank implements USBank, BrazilBank { // we are achieving multiple inheritance
	// Is-a relationship (Interface and class relationship)
	
	// If a class is implementing any Interface, it is mandatory to define/override all the methods of the Interface. 
	
	// Overriding USBank methods
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	
	// Overriding BrazilBank method
	public void mutualFund() {
		System.out.println("hsbc--mutualFunds");
	}
	
	// Separate methods
	public void educationLoan() {
		System.out.println("hsbc--Edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--Car loan");
	}

}
