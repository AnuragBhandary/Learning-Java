package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array: to store similar data type values in an array variable
		//upper bound/index = n-1 (where n is size of array)
		//lowest bound/index = 0
		//one dimensional array
		
		//disadvantages of array:
		// 1 - size is fixed --- hence it is called static array 
		//     -- to overcome this problem we use Collections - Arraylist, Hashtable -- Dynamic array 
		// 2 - stores only similar data types -- to overcome this problem, we use Object array 
		
		//(1) integer array
		int i[] = new int[4]; //4 is size of array
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //will print the length or size of array
		
		//to print all the values of array: use for loop
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		// (2) Double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 11.33;
		d[2] = 9.33;
		System.out.println(d[2]);
		
		// (3) Character array
		char c[] = new char[3];
		c[0] = 'h';
		c[1] = 4;
		c[2] = '$';
		
		//(4) Boolean array
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = true;
		b[2] = false;
		
		// (5) String array (String is a class, hence capital letter)
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "This is Anurag";
		System.out.println(s.length);
		System.out.println(s[1]);
		
		// (6) Object array (Object is a class, hence capital letter)
		// It is used to store different data type values
		Object ob[] = new Object[4];
		ob[0] = "Tom"; //string
		ob[1] = 4; //integer
		ob[2] = 'f'; //character
		ob[3] = 12.33; //double
		System.out.println(ob[3]);
		System.out.println(ob.length);
			

	}

}
