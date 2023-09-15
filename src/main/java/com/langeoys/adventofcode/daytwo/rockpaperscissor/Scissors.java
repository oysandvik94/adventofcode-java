package com.langeoys.adventofcode.daytwo.rockpaperscissor;

/**
 * Scissors
 */
public class Scissors implements Piece {
    public static final int SCORE = 3;
    
    public int fight(Piece adversary) {
        if (adversary instanceof Scissors) {
            return Piece.DRAW;
        } 

        return adversary instanceof Paper ? WIN : LOSE;
    }

    @Override
    public Piece drawsTo() {
        return new Scissors();
    }

    @Override
    public Piece losesTo() {
        return new Rock();
    }

    @Override
    public Piece winsAgainst() {
        return new Paper();
    }

    public int getPieceScore() {
        return SCORE;
    }
    @Override
    public String toString() {
        return "Scissors";
    }
}
