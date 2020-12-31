package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-9/r9azLYp2BDZPyzaG2
 */

public class KnapsackLight {

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (maxW < weight1 && maxW < weight2) {
            return 0;
        }
        if (maxW >= weight1 + weight2) {
            return value1 + value2;
        }
        if (weight1 > maxW) {
            return value2;
        }
        if (weight2 > maxW) {
            return value1;
        }
        return Math.max(value1, value2);
    }
}
