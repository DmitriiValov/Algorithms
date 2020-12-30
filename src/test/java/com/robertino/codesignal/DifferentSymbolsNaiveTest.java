package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DifferentSymbolsNaiveTest {


    private static DifferentSymbolsNaive differentSymbolsNaive;

    @BeforeClass
    public static void setup() {
        differentSymbolsNaive = new DifferentSymbolsNaive();
    }

    @Test
    public void test1() {
        String inputString = "cabca";
        assertThat(differentSymbolsNaive.differentSymbolsNaive(inputString)).isEqualTo(3);
    }

    @Test
    public void test2() {
        String inputString = "aba";
        assertThat(differentSymbolsNaive.differentSymbolsNaive(inputString)).isEqualTo(2);
    }

    @Test
    public void test3() {
        String inputString = "ccccccccccc";
        assertThat(differentSymbolsNaive.differentSymbolsNaive(inputString)).isEqualTo(1);
    }

    @Test
    public void test4() {
        String inputString = "ccccccccccc";
        assertThat(differentSymbolsNaive.differentSymbolsNaive2(inputString)).isEqualTo(1);
    }
}
