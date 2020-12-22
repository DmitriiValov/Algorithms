package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvenDigitsOnlyTest {

    private static EvenDigitsOnly evenDigitsOnly;

    @BeforeClass
    public static void setup() {
        evenDigitsOnly = new EvenDigitsOnly();
    }

    @Test
    public void test1() {
        int n = 248622;
        assertThat(evenDigitsOnly.evenDigitsOnly(n)).isEqualTo(true);
    }

    @Test
    public void test2() {
        int n = 642386;
        assertThat(evenDigitsOnly.evenDigitsOnly(n)).isEqualTo(false);
    }

    @Test
    public void test3() {
        int n = 248842;
        assertThat(evenDigitsOnly.evenDigitsOnly(n)).isEqualTo(true);
    }

    @Test
    public void test4() {
        int n = 1;
        assertThat(evenDigitsOnly.evenDigitsOnly(n)).isEqualTo(false);
    }

    @Test
    public void test5() {
        int n = 248622;
        assertThat(evenDigitsOnly.evenDigitsOnly2(n)).isEqualTo(true);
    }
}
