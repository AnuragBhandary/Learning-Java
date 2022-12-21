package JavaBasics;

import java.util.ArrayList;

public class ArrayListsConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		ar.add("Hello"); //5
		ar.add("Tom"); //6
		ar.add(12.33); //7
		ar.add('M'); //8
		ar.add(600); //9
		
		System.out.println(ar.size()); //10
		
		ar.remove(9);
		
		System.out.println(ar.size()); //9
		
		System.out.println(ar.get(4));
		
		System.out.println("****************");
		//System.out.println(ar.get(9)); -- Error - IndexOutOfBoundsExcpetion
		
		// To print all the values of ArrayList : For loop
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// To restrict data type in Arraylist
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // Restricted to only integers
		ar1.add(150);
		//ar1.add("Hello") - Not applicable
		
		ArrayList<String> ar2 = new ArrayList<String>(); // Restricted to only String
		ar2.add("Hi");
		
		

	}

}
