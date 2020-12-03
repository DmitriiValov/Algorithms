package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP

Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
 */

import java.util.Arrays;

public class AreSimilar {

    public boolean areSimilar(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        int aValue = -1;
        int bValue = -1;
        boolean flag = false;

        for (int i = 0; i < a.length; ++i ) {
            if (a[i] != b[i]) {
                if (flag) return  false;
                if (aValue == -1) {
                    aValue = a[i];
                    bValue = b[i];
                }
                else {
                    if (aValue != b[i] || bValue != a[i]) {
                        return false;
                    }
                    else {
                        flag = true;
                    }
                }
            }
        }
        if(aValue != -1 && !flag) {
            return false;
        }
        return true;
    }

    boolean areSimilar2(int[] a, int[] b) {
        int differences = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                differences++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b) && differences < 3;
    }
}
