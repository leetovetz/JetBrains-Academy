package day04;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int[] array = new int[100];

		Random random = new Random();

		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(10_000);

		int max = array[0];
		for (int element : array) {
			if (element > max)
				max = element;
		}

		System.out.println("The maximal element of the array is = " + max);

		int min = array[0];
		for (int element : array) {
			if (element < min)
				min = element;
		}

		System.out.println("The minimum element of the array is = " + min);

		int counter = 0;
		for (int element : array) {
			if (element % 10 == 0)
				counter++;
		}

		System.out.println("The numbers ending in zero in the array are = " + counter);

		int sum = 0;
		for (int element : array) {
			if (element % 10 == 0)
				sum += element;
		}

		System.out.println("The sum of the numbers ending in zero in the array is = " + sum);
	}
}
