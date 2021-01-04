package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DigitDegreeTest {

    private static DigitDegree digitDegree;

    @BeforeClass
    public static void setup() {
        digitDegree = new DigitDegree();
    }

    @Test
    public void test1() {
        int n = 5;
        assertThat(digitDegree.digitDegree(n)).isEqualTo(0);
    }

    @Test
    public void test2() {
        int n = 100;
        assertThat(digitDegree.digitDegree(n)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int n = 91;
        assertThat(digitDegree.digitDegree(n)).isEqualTo(2);
    }
}
