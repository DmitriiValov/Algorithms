package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayChangeTest {

    private static ArrayChange arrayChange;

    @BeforeClass
    public static void setup() {
        arrayChange = new ArrayChange();
    }

    @Test
    public void test1() {
        int[] inputArray = { 1, 1, 1 };
        assertThat(arrayChange.arrayChange(inputArray)).isEqualTo(3);
    }

    @Test
    public void test2() {
        int[] inputArray = { -1000, 0, -2, 0 };
        assertThat(arrayChange.arrayChange(inputArray)).isEqualTo(5);
    }

    @Test
    public void test3() {
        int[] inputArray = { 2, 1, 10, 1 };
        assertThat(arrayChange.arrayChange(inputArray)).isEqualTo(12);
    }
}
