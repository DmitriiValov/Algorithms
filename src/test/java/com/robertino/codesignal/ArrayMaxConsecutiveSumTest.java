package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMaxConsecutiveSumTest {

    private static ArrayMaxConsecutiveSum arrayMaxConsecutiveSum;

    @BeforeClass
    public static void setup() {
        arrayMaxConsecutiveSum = new ArrayMaxConsecutiveSum();
    }

    @Test
    public void test1() {
        int[] inputArray = { 2, 3, 5, 1, 6 };
        int k = 2;
        assertThat(arrayMaxConsecutiveSum.arrayMaxConsecutiveSum(inputArray, k)).isEqualTo(8);
    }

    @Test
    public void test2() {
        int[] inputArray = { 2, 4, 10, 1 };
        int k = 2;
        assertThat(arrayMaxConsecutiveSum.arrayMaxConsecutiveSum(inputArray, k)).isEqualTo(14);
    }

    @Test
    public void test3() {
        int[] inputArray = { 1, 3, 2, 4 };
        int k = 3;
        assertThat(arrayMaxConsecutiveSum.arrayMaxConsecutiveSum(inputArray, k)).isEqualTo(9);
    }

    @Test
    public void test4() {
        int[] inputArray = { 3, 2, 1, 1 };
        int k = 1;
        assertThat(arrayMaxConsecutiveSum.arrayMaxConsecutiveSum(inputArray, k)).isEqualTo(3);
    }

    @Test
    public void test5() {
        int[] inputArray = { 1, 3, 4, 2, 4, 2, 4 };
        int k = 4;
        assertThat(arrayMaxConsecutiveSum.arrayMaxConsecutiveSum(inputArray, k)).isEqualTo(13);
    }
}
