package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get("C"));
		System.out.println(h.get(1));
		
		h.put(3, "Tom");
		
		// To restrict to a particular data type - for both keys and values
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>(); // Both keys and values are restricted to integers.
		h1.put(5, 6);
		//h1.put(12.33, 2); - Not applicable as key is a double and not an integer
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>(); // Key is integer, value is string
		h2.put(6, "test1");
		//h2.put("hi", 7); - Not applicable
		

	}

}
