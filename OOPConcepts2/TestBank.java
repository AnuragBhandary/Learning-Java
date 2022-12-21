package OOPConcepts2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		System.out.println("******");
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		System.out.println("***************");
		
		//dynamic polymorphism:
		//child class object can be referred by parent Interface reference variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}

}
