package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		System.out.println(x.length); // total number of rows - 3
		System.out.println(x[0].length); // total number of columns - 5
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd row
		x[1][0] = "F";
		x[1][1] = "G";
		x[1][2] = "H";
		x[1][3] = "I";
		x[1][4] = "J";
		
		//3rd row
		x[2][0] = "K";
		x[2][1] = "L";
		x[2][2] = "M";
		x[2][3] = "N";
		x[2][4] = "O";
		
		System.out.println(x[2][3]);
		System.out.println(x[1][4]);
		System.out.println(x[0][2]);
		
		//to print all values of 2D array - Use 2 for loops, one for row and one for column
		//row = 0, column 0 to 4
		//row = 1, column 0 to 4
		//row = 2, column 0 to 4
		
		for(int row = 0; row<x.length; row++) {
			for(int col = 0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}

	}

}
