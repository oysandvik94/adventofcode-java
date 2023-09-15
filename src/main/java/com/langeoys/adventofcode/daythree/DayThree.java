package com.langeoys.adventofcode.daythree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DayThree
 */
public class DayThree {
    private static char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static int puzzleOne(String puzzleInput) {
        int total = 0;
        String[] lineBreakedPuzzle = puzzleInput.split("\\n");

        for (String puzzleLine : lineBreakedPuzzle) {
            String trimmedPuzzleLine = puzzleLine.replace("\\s", "");
            total += findDuplicatePriority(trimmedPuzzleLine);
        }

        return total;
    }

    public static int findDuplicatePriority(String chars) {
        System.out.println(String.format("Looking for duplicates in: %s", chars));
        int[] characterCount = new int[52];
        chars.chars().forEach(character -> {
            System.out.println(String.format("Looking for %c, %s", character, (char) character));
            characterCount[Arrays.binarySearch(alphabet, (char) character)]++;
        });

        return Arrays.stream(characterCount).filter(character -> character == 2).findFirst().getAsInt();
    }
}
