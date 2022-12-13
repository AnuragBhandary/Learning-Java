package JavaBasics;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		// comparison operators:
		// < > <= >= == !=
		// single '=' is used to assign a value to a variable
		// double '=' (==) is used to compare the values 
		
		int a = 30;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than or equal to b");
		}
		
		int c = 40;
		int d = 40;
		
		if(c==d) {
			System.out.println("c is equal to d");
		}
		else {
			System.out.println("c is not equal to d");
		}
		
		//Write a logic to find the greatest number
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//nested if-else
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest number");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest number");
		}
		else {
			System.out.println("c1 is the greatest number");
		}

	}

}