package day02;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int t = a + 1;
		while (t < b) {
			if (t % 5 == 0 && t % 10 != 0) {
				System.out.println(t);
			}
			t++;
		}
		scanner.close();
	}
	
}
