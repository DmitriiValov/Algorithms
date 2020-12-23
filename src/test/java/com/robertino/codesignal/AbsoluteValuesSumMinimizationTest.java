package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbsoluteValuesSumMinimizationTest {

    private static AbsoluteValuesSumMinimization absoluteValuesSumMinimization;

    @BeforeClass
    public static void setup() {
        absoluteValuesSumMinimization = new AbsoluteValuesSumMinimization();
    }

    @Test
    public void test1() {
        int[] a = { 2, 4, 7 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] a = { 2, 3 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(2);
    }

    @Test
    public void test3() {
        int[] a = { 1, 1, 3, 4 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(1);
    }

    @Test
    public void test4() {
        int[] a = { 23 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(23);
    }

    @Test
    public void test5() {
        int[] a = { -10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(15);
    }

    @Test
    public void test6() {
        int[] a = { -4, -1 };
        assertThat(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a)).isEqualTo(-4);
    }
}
