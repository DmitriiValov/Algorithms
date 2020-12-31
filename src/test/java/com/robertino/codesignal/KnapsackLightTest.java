package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KnapsackLightTest {

    private static KnapsackLight knapsackLight;

    @BeforeClass
    public static void setup() {
        knapsackLight = new KnapsackLight();
    }

    @Test
    public void test1() {
        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 8;

        assertThat(knapsackLight.knapsackLight(value1, weight1, value2, weight2, maxW)).isEqualTo(10);
    }
}
