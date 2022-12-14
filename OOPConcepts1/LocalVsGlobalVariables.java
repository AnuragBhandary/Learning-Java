package OOPConcepts1;

public class LocalVsGlobalVariables {
	
	//Global Variables or Class Variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method
		System.out.println(i);
		
		// an object needs to be created for accessing non static methods and global variables
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
	}

	public void sum() {
		int i = 15; // local variable for sum method
		int j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
