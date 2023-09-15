package com.langeoys.adventofcode.daytwo.rockpaperscissor;

/**
 * Rock
 */
public class Rock implements Piece {

    public static final int SCORE = 1;

    public int fight(Piece adversary) {
        if (adversary instanceof Rock) {
            return Piece.DRAW;
        } 

        return adversary instanceof Scissors ? WIN : LOSE;
    }

    public int getPieceScore() {
        return SCORE;
    }

    @Override
    public Piece winsAgainst() {
        return new Scissors();
    }

    @Override
    public Piece losesTo() {
        return new Paper();
    }

    @Override
    public Piece drawsTo() {
        return new Rock();
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
