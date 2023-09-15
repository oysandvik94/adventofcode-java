package com.langeoys.adventofcode.dayone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * FindMaxCalories
 */

public class DayOne {
    public static void FindElfWithHighestCalorieCount() {
        ClassLoader classLoader = DayOne.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream("dayone/calorieinput.txt")) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: dayone/calorieinput.txt");
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            int currentHighestCalorieCount = 0;
            int currentCalorieCount = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    if (currentCalorieCount > currentHighestCalorieCount) {
                        currentHighestCalorieCount = currentCalorieCount;
                    }
                    currentCalorieCount = 0;
                } else {
                    currentCalorieCount += Integer.parseInt(line);
                }
            }

            System.out.println("Found highest calorie count for elf: " +
                    currentHighestCalorieCount);
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }

    }

    public static void FindTotalOfTopThreeElves() {
        ClassLoader classLoader = DayOne.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream("dayone/calorieinput.txt")) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: dayone/calorieinput.txt");
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            int currentCalorieCount = 0;
            List<Integer> calorieCounts = new ArrayList<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    calorieCounts.add(currentCalorieCount);
                    currentCalorieCount = 0;
                } else {
                    currentCalorieCount += Integer.parseInt(line);
                }
            }

            Collections.sort(calorieCounts, Comparator.reverseOrder());
            int totalTopThree = calorieCounts.get(0) + calorieCounts.get(1) + calorieCounts.get(2);
            System.out.println("Sum of top three elves: " + totalTopThree);
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }

    }
}
