package day03;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Enters two numbers. One will be divided by the other. ");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();

			if (b == 0) {
				System.out.println("The program has finished its work. Sorry.");
				break;
			}

			System.out.println(a / b);
		}
	}
}
