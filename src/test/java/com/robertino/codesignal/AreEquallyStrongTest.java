package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AreEquallyStrongTest {

    private static AreEquallyStrong areEquallyStrong;

    @BeforeClass
    public static void setup() {
        areEquallyStrong = new AreEquallyStrong();
    }

    @Test
    public void test1() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        assertThat(areEquallyStrong.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(true);
    }

    @Test
    public void test2() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;

        assertThat(areEquallyStrong.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(false);
    }

    @Test
    public void test3() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        assertThat(areEquallyStrong.areEquallyStrong2(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(true);
    }

    @Test
    public void test4() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;

        assertThat(areEquallyStrong.areEquallyStrong2(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(false);
    }

    @Test
    public void test5() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        assertThat(areEquallyStrong.areEquallyStrong3(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(true);
    }

    @Test
    public void test6() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;

        assertThat(areEquallyStrong.areEquallyStrong3(yourLeft, yourRight, friendsLeft, friendsRight)).isEqualTo(false);
    }
}
