package OOPConcepts1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 5;
		int y = 10;
		int i = obj.testSum(x, y); // call by value or pass by value
		System.out.println(i);
		
		obj.p = 20;
		obj.q = 30;
		
		obj.swap(obj);
		// after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a, int b) {
		a = 3;
		b = 4; 
		int c = a + b;
		return c;
	}
		
	// call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; // temp = 20
		t.p = t.q; // t.p = 30
		t.q = temp; // t.q = 20
	}

}
