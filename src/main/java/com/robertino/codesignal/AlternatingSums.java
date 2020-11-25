package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9

Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the
second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the
first element is the total weight of team 1, and the second element is the total weight of team 2 after the division
is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.

[output] array.integer
 */

import java.util.Arrays;

public class AlternatingSums {

    public static void main(String[] args) {
        int[] a = { 50, 60, 60, 45, 70 };
        int[] results = new AlternatingSums().alternatingSums(a);
        System.out.println(Arrays.toString(results));
    }

    int[] alternatingSums(int[] a) {
        int n = 2;
        int[] sum = new int[n];
        for (int i = 0; i < a.length; ++i) {
            sum[i % n] += a[i];
        }
        return sum;
    }
}
