package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayReplaceTest {

    private static ArrayReplace arrayReplace;

    @BeforeClass
    public static void setup() {
        arrayReplace = new ArrayReplace();
    }

    @Test
    public void test1() {
        int[] inputArray = { 1, 2, 1 };
        int elemToReplace = 1;
        int substitutionElem = 3;
        int[] results = { 3, 2, 3 };
        assertThat(arrayReplace.arrayReplace(inputArray, elemToReplace, substitutionElem)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] inputArray = { 1, 2, 3, 4, 5 };
        int elemToReplace = 3;
        int substitutionElem = 0;
        int[] results = { 1, 2, 0, 4, 5 };
        assertThat(arrayReplace.arrayReplace(inputArray, elemToReplace, substitutionElem)).isEqualTo(results);
    }
}
