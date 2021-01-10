/*
 * Given a real number R of the form nnn.ddd 
 * (three digits in the fractional and integer parts). 
 * Swap the fractional and integer parts of the number 
 * and print the resulting value of the number.
 */

package Basics;

import java.text.DecimalFormat;

public class Task4 {

	public static void main(String[] args) {
		flipNumber(-123.456);
	}

	private static void flipNumber(double x) {
		x = (int) x / 1000.0 + (x - (int) x) * 1000;
		System.out.println(new DecimalFormat("#0.000").format(x));
	}
}
