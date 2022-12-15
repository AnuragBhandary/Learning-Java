package OOPConcepts1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(4);
		obj.sum(24.33);
		obj.sum(2, 3);
		

	}
	
	//We can overload main method as well.
	
	public static void main(int p) {
		
	}
	
	//We can't create a method inside a method.
	//Duplicate methods (methods with same name and same number of arguments) are not allowed.
	
	//Method Overloading -- When method name is same with different arguments/input parameters, within the same class.
	
	public void sum() { // 0 input parameter
		System.out.println("sum method - 0 parameter");
	}
	
	public void sum(int i) { // 1 input parameter
		System.out.println("sum method - 1 parameter");
		System.out.println(i);
	}
	
	//Same number of input parameters but different data types are allowed
	public void sum(double h) { // 1 input parameter
		System.out.println("sum method - 1 parameter");
		System.out.println(h);
	}
	
	public void sum(int j, int k) { // 2 input parameters
		System.out.println("sum method - 2 parameters");
		System.out.println(j);
		System.out.println(k);
	}

}
