package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AvoidObstaclesTest {

    private static AvoidObstacles avoidObstacles;

    @BeforeClass
    public static void setup() {
        avoidObstacles = new AvoidObstacles();
    }

    @Test
    public void test1() {
        int[] inputArray = { 5, 3, 6, 7, 9 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(4);
    }

    @Test
    public void test2() {
        int[] inputArray = { 2, 3 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[] inputArray = { 1, 4, 10, 6, 2 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(7);
    }

    @Test
    public void test4() {
        int[] inputArray = { 1000, 999 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(6);
    }

    @Test
    public void test5() {
        int[] inputArray = { 19, 32, 11, 23 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(3);
    }

    @Test
    public void test6() {
        int[] inputArray = { 5, 8, 9, 13, 14 };
        assertThat(avoidObstacles.avoidObstacles(inputArray)).isEqualTo(6);
    }
}
