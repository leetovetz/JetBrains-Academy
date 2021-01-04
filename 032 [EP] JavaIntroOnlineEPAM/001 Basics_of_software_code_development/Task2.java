/*
 * Calculate the value of the expression using the formula (all variables take real values):
 * ((b + √(b^2 + 4ac))/ 2a) - a^3 * c + b^-2
 */

package Basics;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Please enter any three numbers a, b, c ...");

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();

		System.out.println(function(a, b, c));
	}

	private static double function(double a, double b, double c) {
		return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) - Math.pow(a, 3) * c + Math.pow(b, -2);

	}
}
