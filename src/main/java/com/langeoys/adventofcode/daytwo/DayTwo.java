package com.langeoys.adventofcode.daytwo;

import com.langeoys.adventofcode.daytwo.rockpaperscissor.Piece;

/**
 * DayTwo
 */
public class DayTwo {
    public static final char DRAW_CHAR = 'Y';
    public static final char WIN_CHAR = 'Z';
    public static final char LOSE_CHAR = 'X';

    public static int puzzleOne(String puzzleInput) {
        int totalScore = 0;
        for (String inputRow : puzzleInput.split(System.lineSeparator())) {
            String trimmedRow = inputRow.replaceAll("\\s", "");
            if (trimmedRow.length() == 0) {
                continue;
            }
            Piece adversaryPiece = Piece.CreatePiece(trimmedRow.charAt(0));
            Piece playerPiece = Piece.CreatePiece(trimmedRow.charAt(1));

            totalScore += playerPiece.fight(adversaryPiece) + playerPiece.getPieceScore();
        }

        return totalScore;
    }

    public static int puzzleTwo(String puzzleInput) {
        int totalScore = 0;

        for (String inputRow : puzzleInput.split(System.lineSeparator())) {
            String trimmedRow = inputRow.replaceAll("\\s", "");

            Piece adversaryPiece = Piece.CreatePiece(trimmedRow.charAt(0));

            char outcomeChar = trimmedRow.charAt(1);
            if (outcomeChar == DRAW_CHAR) {
                totalScore += adversaryPiece.fight(adversaryPiece) + adversaryPiece.getPieceScore();
                continue;
            }

            if (outcomeChar == LOSE_CHAR) {
                Piece pieceToUse = adversaryPiece.winsAgainst();
                totalScore += pieceToUse.fight(adversaryPiece) + pieceToUse.getPieceScore();
                continue;
            }

            Piece pieceToUse = adversaryPiece.losesTo();
            totalScore += pieceToUse.fight(adversaryPiece) + pieceToUse.getPieceScore();
        }

        return totalScore;
    }
}
