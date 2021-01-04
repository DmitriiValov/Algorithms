package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringsRearrangementTest {

    private static StringsRearrangement stringsRearrangement;

    @BeforeClass
    public static void setup() {
        stringsRearrangement = new StringsRearrangement();
    }

    @Test
    public void test1() {
        String[] inputArray = { "aba", "bbb", "bab" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isFalse();
    }

    @Test
    public void test2() {
        String[] inputArray = { "ab", "bb", "aa" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isTrue();
    }

    @Test
    public void test3() {
        String[] inputArray = { "q", "q" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isFalse();
    }

    @Test
    public void test4() {
        String[] inputArray = { "zzzzab", "zzzzbb", "zzzzaa" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isTrue();
    }

    @Test
    public void test5() {
        String[] inputArray = { "ab", "ad", "ef", "eg" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isFalse();
    }

    @Test
    public void test6() {
        String[] inputArray = { "abc", "bef", "bcc", "bec", "bbc", "bdc" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isTrue();
    }

    @Test
    public void test8() {
        String[] inputArray = { "abc", "abx", "axx", "abx", "abc" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isTrue();
    }

    @Test
    public void test9() {
        String[] inputArray = { "ff", "gf", "af", "ar", "hf" };
        assertThat(stringsRearrangement.stringsRearrangement(inputArray)).isTrue();
    }

}
