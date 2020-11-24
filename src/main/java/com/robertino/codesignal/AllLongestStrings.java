package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL

Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

    public static void main(String[] args) {
        String[] inputArray = { "aba", "aa", "ad", "vcd", "aba" };
        String[] results = new AllLongestStrings().allLongestStrings(inputArray);
        System.out.println(Arrays.toString(results));
    }

    String[] allLongestStrings(String[] inputArray) {
        List<String> results = new ArrayList<>();
        int maxLength = inputArray[0].length();
        for(int i = 0; i < inputArray.length; ++i) {
            if(inputArray[i].length() > maxLength) {
                maxLength = inputArray[i].length();
                results.clear();
                results.add(inputArray[i]);
            }
            else if(inputArray[i].length() == maxLength) {
                results.add(inputArray[i]);
            }
        }
        String[] array = results.toArray(new String[results.size()]);
        return array;
    }
}
