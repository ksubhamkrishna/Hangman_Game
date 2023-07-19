// Program to show how to generate random words,letters or integers from a given range of integer first so that we can make hangman game using this concept,then from Array of String & Letters using random class. 

package hangmangame;

import java.util.Random;

public class GeneratingAndSelectingRandom {

	public static void main(String[] args) {
		Random random = new Random();

		int randominteger = random.nextInt(10);
		System.out.println(
				"Random Integer generated from a range of 0 to 10 excluding 10 using random class variable is : "
						+ randominteger);

		String names[] = new String[] { "Subham", "Subhu", "Shivam", "Megha", "Nayak", "Krishna", "Kumar", "Jena",
				"Jyoti", "Patel", "Srabani", "Gowda" };
		String randomword = names[random.nextInt(names.length)];
		System.out.println("Random word generated selecting automatically from an Array of Words is : " + randomword);
	}

}




