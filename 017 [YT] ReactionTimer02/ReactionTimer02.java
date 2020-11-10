/*
 * The task. Create a program that will count the time to solve the problem of adding two numbers. 
 */

import java.util.Scanner;

public class ReactionTimer02 {

	public static void main(String[] args) throws InterruptedException {

		Scanner s = new Scanner(System.in);

		System.out.println("How fast can you Add ?");

		Thread.sleep(1000);

		double r1 = Math.random() * 100;
		double r2 = Math.random() * 100;

		int rI1 = (int) r1;
		int rI2 = (int) r2;

		System.out.println(rI1 + "+" + rI2);
		long startTime = System.currentTimeMillis();

		int sum = s.nextInt();
		long endTime = System.currentTimeMillis();

		long reactionTime = endTime - startTime;

		System.out.print("Reaction time is " + reactionTime + " ms ");
		if (sum != (rI1 + rI2))
			System.out.println("but the answer is wrong !");

	}

}
