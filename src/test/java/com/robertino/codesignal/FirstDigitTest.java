package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstDigitTest {

    private static FirstDigit firstDigit;

    @BeforeClass
    public static void setup() {
        firstDigit = new FirstDigit();
    }

    @Test
    public void test1() {
        String inputString = "var_1__Int";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('1');
    }

    @Test
    public void test2() {
        String inputString = "q2q-q";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('2');
    }

    @Test
    public void test3() {
        String inputString = "0ss";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('0');
    }

    @Test
    public void test4() {
        String inputString = "_Aas_23";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('2');
    }

    @Test
    public void test5() {
        String inputString = "a a_933";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('9');
    }

    @Test
    public void test6() {
        String inputString = "ok0";
        assertThat(firstDigit.firstDigit(inputString)).isEqualTo('0');
    }

    @Test
    public void test7() {
        String inputString = "ok0";
        assertThat(firstDigit.firstDigit2(inputString)).isEqualTo('0');
    }
}
