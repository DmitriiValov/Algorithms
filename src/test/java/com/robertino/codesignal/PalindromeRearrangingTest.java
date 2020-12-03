package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeRearrangingTest {

    private static PalindromeRearranging palindromeRearranging;

    @BeforeClass
    public static void setup() {
        palindromeRearranging = new PalindromeRearranging();
    }

    @Test
    public void test1() {
        String inputString = "aabb";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(true);
    }

    @Test
    public void test2() {
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(false);
    }

    @Test
    public void test3() {
        String inputString = "abbcabb";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(true);
    }

    @Test
    public void test4() {
        String inputString = "zyyzzzzz";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(true);
    }

    @Test
    public void test5() {
        String inputString = "z";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(true);
    }

    @Test
    public void test6() {
        String inputString = "zaa";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(true);
    }

    @Test
    public void test7() {
        String inputString = "abca";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(false);
    }

    @Test
    public void test8() {
        String inputString = "abcad";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(false);
    }

    @Test
    public void test9() {
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(false);
    }

    @Test
    public void test10() {
        String inputString = "abdhuierf";
        assertThat(palindromeRearranging.palindromeRearranging(inputString)).isEqualTo(false);
    }
}
