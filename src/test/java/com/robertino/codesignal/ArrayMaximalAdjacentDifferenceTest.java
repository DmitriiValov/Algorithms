package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayMaximalAdjacentDifferenceTest {

    private static ArrayMaximalAdjacentDifference arrayMaximalAdjacentDifference;

    @BeforeClass
    public static void setup() {
        arrayMaximalAdjacentDifference = new ArrayMaximalAdjacentDifference();
    }

    @Test
    public void test1() {
        int[] inputArray = { 2, 4, 1, 0 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(3);
    }

    @Test
    public void test2() {
        int[] inputArray = { 1, 1, 1, 1 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(0);
    }

    @Test
    public void test3() {
        int[] inputArray = { -1, 4, 10, 3, -2 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(7);
    }

    @Test
    public void test4() {
        int[] inputArray = { 10, 11, 13 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(2);
    }

    @Test
    public void test5() {
        int[] inputArray = { -2, -2, -2, -2, -2 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(0);
    }

    @Test
    public void test6() {
        int[] inputArray = { -1, 1, -3, -4 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(4);
    }

    @Test
    public void test7() {
        int[] inputArray = { -14, 15, -15 };
        assertThat(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray)).isEqualTo(30);
    }
}
