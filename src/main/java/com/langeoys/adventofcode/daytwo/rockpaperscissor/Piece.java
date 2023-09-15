package com.langeoys.adventofcode.daytwo.rockpaperscissor;

/**
 * Piece
 */
public interface Piece {
    public static final int LOSE = 0;
    public static final int DRAW = 3;
    public static final int WIN = 6;

    public static Piece CreatePiece(char letter) {
        switch (letter) {
            case 'A':
            case 'X':
                return new Rock();
            case 'B':
            case 'Y':
                return new Paper();
            case 'C':
            case 'Z':
                return new Scissors();
            default:
                break;
        }
        throw new IllegalArgumentException(String.format("Could not determine piece for character %c", letter));
    }

    public int fight(Piece adversary);

    public int getPieceScore();

    public Piece winsAgainst();
    public Piece losesTo();
    public Piece drawsTo();
}
