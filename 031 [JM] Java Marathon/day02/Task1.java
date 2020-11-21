package day02;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of floors in your house.");

		int floorCount = scanner.nextInt();

		if (floorCount >= 1 && floorCount <= 4) {
			System.out.println("Your house is low-rise.");
		} else if (floorCount >= 5 && floorCount <= 8) {
			System.out.println("You have a medium-rise house.");
		} else if (floorCount >= 9 && floorCount <= 25) {
			System.out.println("You have a multistory house.");
		} else {
			System.out.println("Incorrect entry of floors in your house. Try again.");
		}
		scanner.close();
	}
}
