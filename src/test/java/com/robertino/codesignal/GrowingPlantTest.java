package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GrowingPlantTest {

    private static GrowingPlant growingPlant;

    @BeforeClass
    public static void setup() {
        growingPlant = new GrowingPlant();
    }

    @Test
    public void test1() {
        int upSpeed = 100;
        int downSpeed = 10;
        int desiredHeight = 910;

        assertThat(growingPlant.growingPlant(upSpeed, downSpeed, desiredHeight)).isEqualTo(10);
    }

    @Test
    public void test2() {
        int upSpeed = 10;
        int downSpeed = 9;
        int desiredHeight = 4;

        assertThat(growingPlant.growingPlant(upSpeed, downSpeed, desiredHeight)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int upSpeed = 5;
        int downSpeed = 2;
        int desiredHeight = 7;

        assertThat(growingPlant.growingPlant(upSpeed, downSpeed, desiredHeight)).isEqualTo(2);
    }

    @Test
    public void test4() {
        int upSpeed = 7;
        int downSpeed = 3;
        int desiredHeight = 443;

        assertThat(growingPlant.growingPlant(upSpeed, downSpeed, desiredHeight)).isEqualTo(110);
    }

    @Test
    public void test5() {
        int upSpeed = 6;
        int downSpeed = 5;
        int desiredHeight = 10;

        assertThat(growingPlant.growingPlant(upSpeed, downSpeed, desiredHeight)).isEqualTo(5);
    }
}
