public class PhraseOMatic{

	public static void main(String args[]){
		String wordListOne[] = {"agnostic", "opinionated", "voice activated", "haptically driven", "reactive", "agent based", "AI enabled"};
		String wordListTwo[] = {"asynchronous", "service oriented", "cloud native", "IoT", "serverless", "microservices"};
		String wordListThree[] = {"framework", "library", "repository", "pipeline", "architecture", "design", "orientation"};

		// Find number of words in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// Generate three random numbers
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		// Now build a random phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("What we need is a " + phrase);
	}

}