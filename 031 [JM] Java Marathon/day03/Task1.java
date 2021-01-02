package day03;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter the name of any city ...");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String city = scanner.nextLine();

			if (city.equals("Stop")) {
				System.out.println("The program is completed.");
				break;
			}

			switch (city) {
			case "Kiev":
			case "Odessa":
			case "Kharkiv":
				System.out.println("Ukraine");
				break;

			case "Rome":
			case "Milan":
			case "Turin":
				System.out.println("Italy");
				break;

			case "London":
			case "Manchester":
			case "Liverpool":
				System.out.println("England");
				break;

			default:
				System.out.println("Unknown country. Try again. ");
			}
		}
	}
}
