/*
Task Guess the Number
Make a program in the console that will guess the number. 
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner (System.in);
		
		do {
			int count = 0;
			int guess = -1;
			int number = random.nextInt(10);
			while (count < 3 && guess != number) {
				System.out.println("Enter the number 0..9:");
				guess = sc.nextInt ();
				if (number != guess) {
					System.out.println ("Your N is " + ((guess > number)? "greater" : "less"));
					count++;
			}
		}
	System.out.println	("You " + ((count == 3)? "lose!" : "WIN!"));
	
	System.out.println ("Repet game? Yes -Y , No - O");

	} while (sc.next().equalsIgnoreCase("Y"));
	}
}



