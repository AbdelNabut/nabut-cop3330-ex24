/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex24;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Scanner;

public class AppTest {

    @Test
    void testIsAnagram() {
        String stringOne = "note";
        String stringTwo = "tone";
        char[] stringOneArray = stringOne.toCharArray();
        char[] stringTwoArray = stringTwo.toCharArray();
        Arrays.sort(stringOneArray);
        Arrays.sort(stringTwoArray);
        Assertions.assertArrayEquals(stringOneArray, stringTwoArray);

    }
}
