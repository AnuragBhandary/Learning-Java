package OOPConcepts1;

public class StaticAndNonStaticConcept {

	//Global variable - The scope of this variable will be available across all functions with some conditions
	//For non static methods and variables we have to create objects in class.
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		
		//how to call static methods and variables
		// 1. Direct calling
		sum();
		// 2. Calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//Can I access static methods using object reference? ... YES
		obj.sum(); //warning will be given
		

	}
	
	public void sendMail() { // non static method
		System.out.println("Send mail method");
	}
	
	public static void sum() { // static method
		System.out.println("Sum method");
	}

}
