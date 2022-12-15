package OOPConcepts1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion - String to integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		//String to Double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean conversion
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Integer to String
		int j = 200;
		String s = String.valueOf(j); //"200"
		System.out.println(s+20);
		
		//It should be not be a mixed data type
		String u = "100A";
		Integer.parseInt(u); // Error - NumberFormatException
		
	}

}
