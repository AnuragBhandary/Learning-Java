package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		
		// 1) While Loops
		// disadvantage of while loop: it will generate infinite loop if you don't give incremental/decrement part
		int i = 1; //initialization
		while(i<=10) { //condition
			System.out.println(i);
			i = i+1; //incremental/decrement
		}
		
		System.out.println("*******************");
		
		// 2) For loops
		// j++ means j = j+1
		for(int j=1;j<=10;j++) { // Initialization Conditional Incremental
			System.out.println(j);
		}
		
		System.out.println("********************");
		
		// print from 10 to 1
		// k-- means k = k-1
		for(int k=10;k>=1;k--) { // Initialization Conditional Decremental
			System.out.println(k);
		}

	}

}
