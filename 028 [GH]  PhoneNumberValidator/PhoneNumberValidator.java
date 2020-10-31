package com.lee.task01;

/* Task. 
 * To create a telephone number validator. And add all the digits in this number. 
 * Student Sergii Kravchenko.
 */

import java.util.Scanner; 
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		int summNumber;
        System.out.println("Welcome. \nPlease enter your mobile number. "
				+ "\nThe number should consist only of numbers. ");

        while (true) {
            int phone = readNumber();
            if (phone == 0) {
                continue;
            } else {
                summNumber = iterationCount(phone);
                break;
            }
        }

        System.out.println("The final result is this:");

        if (summNumber <= 4) {
            switch (summNumber) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("One Two");
                break;
            case 3:
                System.out.println("One Two Three");
                break;
            case 4:
                System.out.println("One Two Three Four");
                break;
            }
        } else {
            for (int i = 1; i <= summNumber; i++) {
                System.out.println(i);
            }
        }
    }

	private static int readNumber() {
        try {
            Scanner getNumber = new Scanner(System.in);
            int number = getNumber.nextInt();
            
            if (number > 999999999 || number < 100000000) {
                System.out.println("Hmm. Your mobile number should have been 9 digits. "
    					+ "Let's try to enter your phone number again. ");
                return 0;
                
            } else {
            	getNumber.close();
                return number;
                
            }
        } catch (InputMismatchException e) {
            System.out.println("Hmm. Doesn't your phone number consist only of numbers? "
            		+ "Let's try to enter only numbers.");
            return 0;
        }
    }
		
	private static int iterationCount(int numb) {
        int count = 1;
        while (numb >= 10) {
            numb = numberSumCalculator(numb);
            System.out.println(count++ + "round" + " sum of digits = " + numb);
        }
        return numb;
    }

	private static int numberSumCalculator(int number) {
        int totalNumbers = 0;
        while (number > 0) {
            totalNumbers = totalNumbers + (number % 10);
            number /= 10;
        }
        return totalNumbers;
    }

}
