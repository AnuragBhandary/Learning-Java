package OOPConcepts1;

public class FunctionsInJava {
	
	// main method is starting point of execution
	// main method is always void because no value is returned
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava(); 
		// one object will be created, "obj" is object reference variable, referring to this object
		// after creating this object, the copy of all non static methods will be given to this object
		
		obj.test();
		
		int t = obj.pqr();
		System.out.println(t);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(40, 20);
		System.out.println(div);
	}
	
	// non static methods
	// void -- does not return any value
	
	// return type = void
	public void test() { // 'test' is method name  (No input, no output)
		System.out.println("test method");
	}
	
	// return type = int
	public int pqr() { // int is return type       (No input, some output)
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// return type = String
	public String qa() { //                        (No input, some output)
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}
	
	//return type = int
	//x and y are input parameters/arguments
	public int division(int x, int y) {
		System.out.println("Division method");
		int d = x/y;
		return d;
	}
}
