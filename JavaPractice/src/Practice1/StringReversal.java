package Practice1;
import java.util.Scanner;
public class StringReversal {

	public static void main(String[] args) {
		String original;
		System.out.println("Enter the string that has to be reversed:");
		Scanner s1 = new Scanner(System.in);
		original = s1.nextLine();
		String reverse = "";
		int len = original.length();
		for (int i = len-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	}

}
