package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircleOfNumbersTest {

    private static CircleOfNumbers circleOfNumbers;

    @BeforeClass
    public static void setup() {
        circleOfNumbers = new CircleOfNumbers();
    }

    @Test
    public void test1() {
        int n = 10;
        int firstNumber = 2;
        assertThat(circleOfNumbers.circleOfNumbers(n, firstNumber)).isEqualTo(7);
    }

    @Test
    public void test2() {
        int n = 10;
        int firstNumber = 7;
        assertThat(circleOfNumbers.circleOfNumbers(n, firstNumber)).isEqualTo(2);
    }

    @Test
    public void test3() {
        int n = 4;
        int firstNumber = 1;
        assertThat(circleOfNumbers.circleOfNumbers(n, firstNumber)).isEqualTo(3);
    }

    @Test
    public void test4() {
        int n = 6;
        int firstNumber = 3;
        assertThat(circleOfNumbers.circleOfNumbers(n, firstNumber)).isEqualTo(0);
    }

    @Test
    public void test5() {
        int n = 6;
        int firstNumber = 3;
        assertThat(circleOfNumbers.circleOfNumbers2(n, firstNumber)).isEqualTo(0);
    }
}
