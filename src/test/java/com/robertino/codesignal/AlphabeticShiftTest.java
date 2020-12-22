package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlphabeticShiftTest {

    private static AlphabeticShift alphabeticShift;

    @BeforeClass
    public static void setup() {
        alphabeticShift = new AlphabeticShift();
    }

    @Test
    public void test1() {
        String inputString = "crazy";
        String result = "dsbaz";
        assertThat(alphabeticShift.alphabeticShift(inputString)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String inputString = "z";
        String result = "a";
        assertThat(alphabeticShift.alphabeticShift(inputString)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String inputString = "crazy";
        String result = "dsbaz";
        assertThat(alphabeticShift.alphabeticShift2(inputString)).isEqualTo(result);
    }
}
