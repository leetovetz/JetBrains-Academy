package com.geekhub.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader readNumber = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				"Welcome. \nPlease enter your mobile number. " + "\nThe number should consist only of numbers.");

		while (true) {
			String strPhone = readNumber.readLine().trim();
			String phone = strPhone.replace(" ", "");

			if (phone.length() == 10) {
				System.out.println("validator: length Ok");

				char[] str = phone.toCharArray();

				int summation[] = new int[3];

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < str.length; j++) {
						summation[i] += Character.getNumericValue(str[j]);
					}
					str = String.valueOf(summation[i]).toCharArray();
				}
				if (summation[2] == 1) {
					System.out.println("One");
				} else if (summation[2] == 2) {
					System.out.println("two");
				} else if (summation[2] == 3) {
					System.out.println("three");
				} else {
					System.out.println(summation[2]);
				}
				return;

			} else {
				System.out.println(
						"Hmm. Doesn't your phone number consist only of 10 numbers? \nLet's try to enter only numbers.");
			}
		}
	}
}
