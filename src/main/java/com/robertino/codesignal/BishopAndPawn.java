package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-9/6M57rMTFB9MeDeSWo

Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can
capture the pawn in one move.
 */

public class BishopAndPawn {
    boolean bishopAndPawn(String bishop, String pawn) {
        return Math.abs(bishop.charAt(0) - pawn.charAt(0)) == Math.abs(bishop.charAt(1) - pawn.charAt(1));
    }
}
