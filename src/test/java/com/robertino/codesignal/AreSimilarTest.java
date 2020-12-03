package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AreSimilarTest {

    private static AreSimilar areSimilar;

    @BeforeClass
    public static void setup() {
        areSimilar = new AreSimilar();
    }

    @Test
    public void test1() {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 3, 2, 1, 4 };
        assertThat(areSimilar.areSimilar(a, b)).isEqualTo(true);
    }

    @Test
    public void test2() {
        int[] a = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
        int[] b = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
        assertThat(areSimilar.areSimilar(a, b)).isEqualTo(true);
        assertThat(areSimilar.areSimilar2(a, b)).isEqualTo(true);
    }

    @Test
    public void test3() {
        int[] a = { 832, 998, 148, 570, 533, 561, 894, 279, 455, 147 };
        int[] b = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
        assertThat(areSimilar.areSimilar(a, b)).isEqualTo(false);
        assertThat(areSimilar.areSimilar2(a, b)).isEqualTo(false);
    }
}
