package com.robertino.codesignal;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DepositProfitTest {

    private static DepositProfit depositProfit;

    @BeforeClass
    public static void setup() {
        depositProfit = new DepositProfit();
    }

    @Test
    public void test1() {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        assertThat(depositProfit.depositProfit(deposit, rate, threshold)).isEqualTo(3);
    }

    @Test
    public void test2() {
        int deposit = 100;
        int rate = 1;
        int threshold = 101;
        assertThat(depositProfit.depositProfit(deposit, rate, threshold)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int deposit = 1;
        int rate = 100;
        int threshold = 64;
        assertThat(depositProfit.depositProfit(deposit, rate, threshold)).isEqualTo(6);
    }

    @Test
    public void test4() {
        int deposit = 20;
        int rate = 20;
        int threshold = 50;
        assertThat(depositProfit.depositProfit(deposit, rate, threshold)).isEqualTo(6);
    }
}
