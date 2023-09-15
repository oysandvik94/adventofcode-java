package com.langeoys.adventofcode.daytwo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

/**
 * DayTwoTest
 */
public class DayTwoTest {

    @Test
    public void PuzzleOneTest() throws IOException, URISyntaxException {
        final String PUZZLE_INPUT = """
                A Y
                B X
                C Z
                        """;

        Assert.assertEquals("Should solve example puzzle", 15, DayTwo.puzzleOne(PUZZLE_INPUT));

        String puzzleInput = Files
                .readString(Paths.get(DayTwo.class.getClassLoader().getResource("daytwo/input.txt").toURI()));

        Assert.assertEquals("Should solve actual puzzle", 11603, DayTwo.puzzleOne(puzzleInput));
    }

    @Test
    public void PuzzleTwoTest() throws IOException, URISyntaxException {
        final String PUZZLE_INPUT = """
                A Y
                B X
                C Z
                        """;

        Assert.assertEquals("Should solve example puzzle", 12, DayTwo.puzzleTwo(PUZZLE_INPUT));

        String puzzleInput = Files
                .readString(Paths.get(DayTwo.class.getClassLoader().getResource("daytwo/input.txt").toURI()));

        Assert.assertEquals("Should solve actual puzzle", 12725, DayTwo.puzzleTwo(puzzleInput));
    }
}
