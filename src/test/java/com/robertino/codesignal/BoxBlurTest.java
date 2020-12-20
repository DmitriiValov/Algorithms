package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoxBlurTest {

    private static BoxBlur boxBlur;

    @BeforeClass
    public static void setup() {
        boxBlur = new BoxBlur();
    }

    @Test
    public void test1() {
        int[][] image = { { 1, 1, 1 }, { 1, 7, 1 }, { 1, 1, 1 } };
        int[][] result = { { 1 } };
        assertThat(boxBlur.boxBlur(image)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[][] image = { { 0, 18, 9 }, { 27, 9, 0 }, { 81, 63, 45 } };
        int[][] result = { { 28 } };
        assertThat(boxBlur.boxBlur(image)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[][] image = { { 36, 0, 18, 9 }, { 27, 54, 9, 0 }, { 81, 63, 72, 45 } };
        int[][] result = { { 40, 30 } };
        assertThat(boxBlur.boxBlur(image)).isEqualTo(result);
    }
}
