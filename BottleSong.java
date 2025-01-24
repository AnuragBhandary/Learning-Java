public class BottleSong{

	public static void main(String args[]){
		int bottlesNum = 5;
		String word = "bottles"; // plural word default

		while (bottlesNum > 0){
			if (bottlesNum == 1){
				word = "bottle"; // singular word
			}

			System.out.println(bottlesNum + " green " + word + ", hanging on a wall");
			System.out.println(bottlesNum + " green " + word + ", hanging on a wall");
			System.out.println("And if one green bottle should accidentally fall, ");
			bottlesNum = bottlesNum - 1;
			
			if (bottlesNum == 1){
				word = "bottle"; // singular word
			}

			if (bottlesNum > 0){
				System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall.");
			}	else{
				System.out.println("There'll be no green bottles, hanging on the wall");
				}

		}
	}

}