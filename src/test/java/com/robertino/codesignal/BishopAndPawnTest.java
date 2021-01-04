package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BishopAndPawnTest {

    private static BishopAndPawn bishopAndPawn;

    @BeforeClass
    public static void setup() {
        bishopAndPawn = new BishopAndPawn();
    }

    @Test
    public void test1() {
        String bishop = "a1";
        String pawn = "c3";
        assertThat(bishopAndPawn.bishopAndPawn(bishop, pawn)).isEqualTo(true);
    }

    @Test
    public void test2() {
        String bishop = "h1";
        String pawn = "h3";
        assertThat(bishopAndPawn.bishopAndPawn(bishop, pawn)).isEqualTo(false);
    }

    @Test
    public void test3() {
        String bishop = "a5";
        String pawn = "c3";
        assertThat(bishopAndPawn.bishopAndPawn(bishop, pawn)).isEqualTo(true);
    }
}
