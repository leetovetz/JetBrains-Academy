/*
 * Task. S.8.1  
 * Display all letters of the English alphabet on the screen.
 */

public class EnglishAlphabet {

	public static void main(String[] args) {
		printEnglishAlphabet();

	}

	private static void printEnglishAlphabet() {
		printEnglishAlphabet('A', 'Z');
		System.out.println(" ");
		printEnglishAlphabet('a', 'z');

	}

	private static void printEnglishAlphabet(final char from, final char to) {
		for (char ch = from; ch <= to; ch++) {
			System.out.print(ch + " ");
		}
	}
}
