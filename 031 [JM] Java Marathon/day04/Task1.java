package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array ...");

		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		scanner.close();
		Random random = new Random();
		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(20);

		System.out.println("The array was generated like this ...");
		System.out.println(Arrays.toString(array));
		System.out.print("Array length = ");
		System.out.println(array.length);

		int counter8 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 8)
				counter8++;
		}

		System.out.println("The number of numbers greater than 8 equals = " + counter8);

		int counter1 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1)
				counter1++;
		}

		System.out.println("The number of digits equal to one is = " + counter1);

		int counterEven = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				counterEven++;
		}

		System.out.println("The even numbers in the array are = " + counterEven);
		
		int counterOdd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				counterOdd++;
		}

		System.out.println("The odd numbers in the array are = " + counterOdd);
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("The sum of all elements of the array is = " + sum);
	}
}
