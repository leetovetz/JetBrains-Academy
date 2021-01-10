/*
 * Given a natural number T, 
 * which represents the duration of elapsed time in seconds. 
 * Output the given value of duration in hours, 
 * minutes and seconds in the following form: HHH MMmin SSc
 */

package Basics;

public class Task5 {

	public static void main(String[] args) {
		getTime(8541);
	}

	private static void getTime(int seconds) {
		int sec = seconds % 60;
		seconds = seconds / 60;
		int min = seconds % 60;
		seconds = seconds / 60;
		System.out.println(seconds + " hours " + min + " minutes " + sec + " seconds");

	}
}
