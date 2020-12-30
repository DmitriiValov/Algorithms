package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtractEachKthTest {

    private static ExtractEachKth extractEachKth;

    @BeforeClass
    public static void setup() {
        extractEachKth = new ExtractEachKth();
    }

    @Test
    public void test1() {
        int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        int[] result = { 1, 2, 4, 5, 7, 8, 10 };
        assertThat(extractEachKth.extractEachKth(inputArray, k)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] inputArray = { 1, 1, 1, 1, 1 };
        int k = 1;
        int[] result = { };
        assertThat(extractEachKth.extractEachKth(inputArray, k)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[] inputArray = { 1, 2, 1, 2, 1, 2, 1, 2 };
        int k = 2;
        int[] result = { 1, 1, 1, 1 };
        assertThat(extractEachKth.extractEachKth(inputArray, k)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int[] inputArray = { 1, 2, 1, 2, 1, 2, 1, 2 };
        int k = 10;
        int[] result = { 1, 2, 1, 2, 1, 2, 1, 2 };
        assertThat(extractEachKth.extractEachKth(inputArray, k)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int[] inputArray = { 2, 4, 6, 8, 10 };
        int k = 2;
        int[] result = { 2, 6, 10 };
        assertThat(extractEachKth.extractEachKth(inputArray, k)).isEqualTo(result);
    }
}
