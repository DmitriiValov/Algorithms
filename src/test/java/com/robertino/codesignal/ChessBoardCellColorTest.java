package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardCellColorTest {

    private static ChessBoardCellColor chessBoardCellColor;

    @BeforeClass
    public static void setup() {
        chessBoardCellColor = new ChessBoardCellColor();
    }

    @Test
    public void test1() {
        String cell1 = "A1";
        String cell2 = "C3";
        assertThat(chessBoardCellColor.chessBoardCellColor(cell1, cell2)).isEqualTo(true);
    }

    @Test
    public void test2() {
        String cell1 = "A1";
        String cell2 = "H3";
        assertThat(chessBoardCellColor.chessBoardCellColor(cell1, cell2)).isEqualTo(false);
    }

    @Test
    public void test3() {
        String cell1 = "A1";
        String cell2 = "A2";
        assertThat(chessBoardCellColor.chessBoardCellColor(cell1, cell2)).isEqualTo(false);
    }

    @Test
    public void test4() {
        String cell1 = "A1";
        String cell2 = "B2";
        assertThat(chessBoardCellColor.chessBoardCellColor(cell1, cell2)).isEqualTo(true);
    }
}
