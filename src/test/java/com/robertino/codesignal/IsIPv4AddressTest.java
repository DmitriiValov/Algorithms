package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IsIPv4AddressTest {

    private static IsIPv4Address isIPv4Address;

    @BeforeClass
    public static void setup() {
        isIPv4Address = new IsIPv4Address();
    }

    @Test
    public void test1() {
        String inputString = "172.16.254.1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isTrue();
    }

    @Test
    public void test2() {
        String inputString = "172.316.254.1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test3() {
        String inputString = ".254.255.01";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test4() {
        String inputString = "1.1.1.1a";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test5() {
        String inputString = ".1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test6() {
        String inputString = "0.254.255.0";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isTrue();
    }

    @Test
    public void test7() {
        String inputString = "1.23.256.255.";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test8() {
        String inputString = "1.23.256..";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test9() {
        String inputString = "0..1.0";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test10() {
        String inputString = "64.233.161.00";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test11() {
        String inputString = "64.00.161.131";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test12() {
        String inputString = "01.233.161.131";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test13() {
        String inputString = "35..36.9.9.0";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test14() {
        String inputString = "1.1.1.1.1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test15() {
        String inputString = "1.256.1.1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test16() {
        String inputString = "a0.1.1.1";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test17() {
        String inputString = "0.1.1.256";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test18() {
        String inputString = "129380129831213981.255.255.255";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test19() {
        String inputString = "255.255.255.255abcdekjhf";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test20() {
        String inputString = "7283728";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }

    @Test
    public void test21() {
        String inputString = "0..1.0.0";
        assertThat(isIPv4Address.isIPv4Address(inputString)).isFalse();
    }
}
