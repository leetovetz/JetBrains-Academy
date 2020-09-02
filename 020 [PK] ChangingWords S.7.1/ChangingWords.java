/*
 * Task. S.7.1.
 * The text from 3 words "word1 word2 word3" is given. 
 * Replace the 1st and 3rd words and display the result.
 */


public class ChangingWords {

	public static void main(String[] args) {
		final String line = "word1 word2 word3";
		final String newLine = replaceFirstAndThird(line);
		System.out.println(newLine);

	}
		
	private static String replaceFirstAndThird(final String line) {
		final String[] words = line.split(" ");
		return (words[2] + " " + words[1] + " " + words[0]);
	}
}
