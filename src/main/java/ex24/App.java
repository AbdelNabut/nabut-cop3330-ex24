/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static boolean isAnagram(String stringOne, String stringTwo) {
        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();
        Arrays.sort(stringOneArray);
        Arrays.sort(stringTwoArray);
        return Arrays.equals(stringOneArray, stringTwoArray);
    }

    public static void main(String[] args) {
        String firstWord, secondWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they're anagrams.");
        System.out.print("Enter the first string: ");
        firstWord = input.next();
        System.out.print("Enter the second string: ");
        secondWord = input.next();
        if(firstWord.length() != secondWord.length())
            System.out.println("\"" + firstWord + "\" and \"" + secondWord +
                    "\" CANNOT be anagrams. They are not the same length.");
        else
            if(isAnagram(firstWord, secondWord))
                System.out.println("\"" + firstWord + "\" and \"" + secondWord + "\" are anagrams.");
            else
                System.out.println("\"" + firstWord + "\" and \"" + secondWord + "\" are NOT anagrams.");
    }
}
