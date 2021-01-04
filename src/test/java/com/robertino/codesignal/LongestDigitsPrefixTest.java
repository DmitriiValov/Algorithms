package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestDigitsPrefixTest {

    private static LongestDigitsPrefix longestDigitsPrefix;

    @BeforeClass
    public static void setup() {
        longestDigitsPrefix = new LongestDigitsPrefix();
    }

    @Test
    public void test1() {
        String inputString = "123aa1";
        String resultString = "123";
        assertThat(longestDigitsPrefix.longestDigitsPrefix(inputString)).isEqualTo(resultString);
    }

    @Test
    public void test2() {
        String inputString = "0123456789";
        String resultString = "0123456789";
        assertThat(longestDigitsPrefix.longestDigitsPrefix(inputString)).isEqualTo(resultString);
    }

    @Test
    public void test3() {
        String inputString = "  3) always check for whitespaces";
        String resultString = "";
        assertThat(longestDigitsPrefix.longestDigitsPrefix(inputString)).isEqualTo(resultString);
    }
}
