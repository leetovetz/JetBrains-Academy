/*
 * Task. 
To write a program in Java 11, which entered value "SPD-University" will be divided into 
two groups based on ASCII codes of characters. Symbols that have a paired ASCII 
code belong to the first group. Symbols with odd ASCII code belong to the second group. 
Characters in groups do not have repeats (letters of the alphabet are uppercase, example 
"SPD-UNIVERSITY"). Calculate the difference between the sum of unique characters 
in the first and second group (in ASCII codes) and print the result to the console, 
symbolically and in decimal system.

Translated with www.DeepL.com/Translator (free version)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Spd01 {
    public static void main(String[] args) {
    	System.out.println("Type the word:");
        String readString = readStringFromConsole();

        Set<Character> evenAscii = getEvenSymbolsWithoutRepeat(readString);
        Set<Character> oddAscii = getOddSymbolsWithoutRepeat(readString);

        int difference = getDifference(evenAscii, oddAscii);

        printSymbolBase(evenAscii);
        printSymbolBase(oddAscii);
        System.out.print(difference);
    }

    private static void printSymbolBase(Set<Character> set) {
        for (Character aChar : set) {
            System.out.print(aChar);
        }
        System.out.println();
    }

    public static Set<Character> getEvenSymbolsWithoutRepeat(String string) {
        char[] chars = string.toUpperCase(Locale.ENGLISH).toCharArray();
        Set<Character> evenAscii = new HashSet<>();
        for (Character aChar : chars) {
            int asciiCode = aChar;
            if (asciiCode % 2 == 0) {
                evenAscii.add(aChar);
            }
        }
        return evenAscii;
    }

    public static Set<Character> getOddSymbolsWithoutRepeat(String string) {
        char[] chars = string.toUpperCase(Locale.ENGLISH).toCharArray();
        Set<Character> oddAscii = new HashSet<>();
        for (Character aChar : chars) {
            int asciiCode = aChar;
            if (asciiCode % 2 != 0) {
                oddAscii.add(aChar);
            }
        }
        return oddAscii;
    }

    public static int getDifference(Set<Character> evenSet, Set<Character> oddSet) { ;
        int evenSum = 0;
        int oddSum = 0;
        for (Character aChar : evenSet) {
            evenSum += aChar;
        }
        for (Character aChar : oddSet) {
            oddSum += aChar;
        }
        return evenSum - oddSum;
    }

    private static String readStringFromConsole() {
        String data = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            data = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (data == null) throw new IllegalArgumentException("read message is null");
        return data;
    }
}