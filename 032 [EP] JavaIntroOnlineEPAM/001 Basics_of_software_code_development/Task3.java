/*
 * Calculate the value of the expression using the formula (all variables take real values)
 * ((sin x + cos y) / (cos x - sin y)) * tg xy
 */

package Basics;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers x, y ...");

		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		scanner.close();

		System.out.println(getValue(x, y));
	}

	private static double getValue(double x, double y) {
		return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
	}
}
