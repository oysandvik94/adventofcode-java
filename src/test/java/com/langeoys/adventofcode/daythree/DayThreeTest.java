package com.langeoys.adventofcode.daythree;

import org.junit.Assert;
import org.junit.Test;

/**
 * DayThreeTest
 */
public class DayThreeTest {
    public static final String PUZZLE_ONE_TEST_INPUT = """
                    vJrwpWtwJgWrhcsFMMfFFhFp
            jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
            PmmdzqPrVvPwwTWBwg
            wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
            ttgJtRGJQctTZtZT
            CrZsJsPPZsGzwwsLwLmpwMDw
            """;

    @Test
    public void PuzzleOneTest() {
        Assert.assertEquals(157, DayThree.puzzleOne(PUZZLE_ONE_TEST_INPUT));
    }
}
