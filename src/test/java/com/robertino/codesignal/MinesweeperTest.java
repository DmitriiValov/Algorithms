package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinesweeperTest {


    private static Minesweeper minesweeper;

    @BeforeClass
    public static void setup() {
        minesweeper = new Minesweeper();
    }

    @Test
    public void test1() {
        boolean[][] matrix = { { true, false, false }, { false, true, false }, { false, false, false } };
        int[][] result = { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 1 }  };
        assertThat(minesweeper.minesweeper(matrix)).isEqualTo(result);
    }

    @Test
    public void test2() {
        boolean[][] matrix = { { false, false, false }, { false, false, false } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
        assertThat(minesweeper.minesweeper(matrix)).isEqualTo(result);
    }

    @Test
    public void test3() {
        boolean[][] matrix = { { true, false, false, true },
                { false, false, true, false },
                { true, true, false, true } };
        int[][] result = { { 0, 2, 2, 1 }, { 3, 4, 3, 3 }, { 1, 2, 3, 1 }  };
        assertThat(minesweeper.minesweeper(matrix)).isEqualTo(result);
    }

}
