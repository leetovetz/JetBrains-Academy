/*
 * Find the value of the function: z = ( (a – 3 ) * b / 2) + c
 */

package Basics;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers a, b, c.");

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		
		System.out.println(getValue(a, b, c));
	}

	private static double getValue(double a, double b, double c) {
		return ((a - 3) * b / 2) + c;
	}
}
