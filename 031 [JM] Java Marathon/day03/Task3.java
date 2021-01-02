package day03;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Enters two numbers. One will be divided by the other. ");

		Scanner scanner = new Scanner(System.in);

		int counter = 0;

		while (counter < 5) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();

			counter++;

			if (b == 0) {
				System.out.println("Sorry. You cannot divide by zero.");
				continue;
			}

			System.out.println(a / b);
		}
	}
}
