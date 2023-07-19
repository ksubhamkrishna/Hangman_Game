// Section -8:- hangman in java.

// 11. Filling in characters:-*

/*
 * 1. Hangman:-
 * 
 * 2. Top down Approach and design:-
 * 
 *  There are 2 approaches to design a program:-
 *  a) Top-Down.(Mostly Used):- When you flesh out the high level aspect of any thing means if you design first the outline of a thing and after that the interior of that the details after making the model,then it is called Top-Down Design.
 *  b) Bottom-Up.(Not much used):- Reverse of Top-Down is the bottom up Approach.
 *  
 *  3. Random:-Generating a Random word from the String of Arrays and using it to start and play by guessing the letters in limited number of trials.
 *  
 */

// First Step in order to implement HangMan game starting to build the body of the Hangman game.

// 6. Char Arrays.

// Java Program to get generate the game number of dashes user output.

package hangmangame;

import java.util.Random;

public class RandomWordChoosenUseBodyOfDisplayFirstStep {
	private String words[] = new String[] { "My", "father", "family", "name", "being", "Pirrip", "and", "my",
			"Christian", "name", "Philip", "my", "infant", "tongue", "could", "make", "of", "both", "names", "nothing",
			"longer", "or", "more", "explicit", "than", "Pip", "So", "I", "called", "myself", "and", "came", "to", "be",
			"called", "I", "give", "Pirrip", "as", "my", "father", "family", "name", "on", "the", "authority", "of",
			"his", "tombstone", "and", "my", "sister", "Mrs", "Joe", "Gargery", "who", "married", "the", "blacksmith",
			"As", "I", "never", "saw", "my", "father", "or", "my", "mother", "and", "never", "saw", "any", "likeness",
			"of", "either", "of", "them", "for", "their", "days", "were", "long", "before", "the", "days", "of",
			"photographs", "my", "first", "fancies", "regarding", "what", "they", "were", "like", "were",
			"unreasonably", "derived", "from", "their", "tombstones", "The", "shape", "of", "the", "letters", "on",
			"my", "father", "gave", "me", "an", "odd", "idea", "that", "he", "was", "a", "square", "stout", "dark",
			"man", "with", "curly", "black", "hair", "From", "the", "character", "and", "turn", "of", "the",
			"inscription", "Also", "Georgiana", "Wife", "of", "the", "Above", "I", "drew", "a", "childish",
			"conclusion", "that", "my", "mother", "was", "freckled", "and", "sickly", "To", "five", "little", "stone",
			"lozenges", "each", "about", "a", "foot", "and", "half", "long", "which", "were", "arranged", "in", "neat",
			"row", "beside", "their", "grave", "and", "were", "sacred", "to", "the", "memory", "of", "five", "little",
			"brothers", "of", "mine", "who", "gave", "up", "trying", "to", "get", "a", "living", "exceedingly", "early",
			"in", "that", "universal", "struggle", "I", "am", "indebted", "for", "a", "belief", "I", "religiously",
			"entertained", "that", "they", "had", "all", "been", "born", "on", "their", "backs", "with", "their",
			"hands", "in", "their", "trousers", "pockets", "and", "had", "never", "taken", "them", "out", "in", "this",
			"state", "of", "existence" };

	private Random random = new Random();
	private String chosenWord;
	private char characters[];

	public RandomWordChoosenUseBodyOfDisplayFirstStep() {

		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	public String getChosenWord() {
		return chosenWord;
	}

	public void setChosenWord(String chosenWord) {
		this.chosenWord = chosenWord;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (char ch : characters) {
			/*
			 * if (ch == '\u0000') { sb.append('_'); }
			 * 
			 * else { sb.append(ch); } sb.append(' ');
			 */
			// Shortening our code using Ternary Operator.
			sb.append(ch == '\u0000' ? '_' : ch);
			sb.append(' ');
		}
		// System.out.println(chosenWord);
		return sb.toString();

	}

// 13. Checking User Input:-

	public boolean isComplete() {
		for (char ch : characters) {
			if (ch == '\u0000')
				return false;
		}
		return true;
	}

	public boolean addGuess(char c) {
		boolean correct = false; // 14. Limited tries.
		for (int i = 0; i < chosenWord.length(); i++) {
			if (c == chosenWord.charAt(i)) {
				characters[i] = c;
				correct = true; // 14. Limited tries.
				break;

			}
		}
		return correct; // 14. Limited tries.F

	}

}