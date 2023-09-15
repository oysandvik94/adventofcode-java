package com.langeoys.adventofcode.daytwo.rockpaperscissor;

/**
 * Paper
 */
public class Paper implements Piece {
    public static final int SCORE = 2;
    
    public int fight(Piece adversary) {
        if (adversary instanceof Paper) {
            return Piece.DRAW;
        } 

        return adversary instanceof Rock ? WIN : LOSE;
    }

    public int getPieceScore() {
        return SCORE;
    }

    @Override
    public Piece winsAgainst() {
        return new Rock();
    }

    @Override
    public Piece losesTo() {
        return new Scissors();
    }

    @Override
    public Piece drawsTo() {
        return new Paper();
    }

    @Override
    public String toString() {
        return "Paper";
    }
}
