package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE

Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.
 */

public class ArrayMaximalAdjacentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int distance = 0;
        int prev = inputArray[0];
        for (int i = 1; i < inputArray.length; ++i) {
            if (Math.abs(inputArray[i] - prev) > distance) {
                distance = Math.abs(inputArray[i] - prev);
            }
            prev = inputArray[i];
        }
        return distance;
    }
}
