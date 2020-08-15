/* 
 * The task. Create a program that will determine whether a given word is a palidrom or not. 
 * A palidrom is a word or sentence that can be read from both sides. 
 * Ex: mom, dad, race car, nurses run
 */



public class Palindromes {

	public static void main(String[] args) {
		
		String original = "nurses run";
		original = original.replace(" ", "");
		
		String reverse = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("PALINDROME!");
		} else {
			System.out.println("Not a palindrome!");
		
		
		}
	}

}
