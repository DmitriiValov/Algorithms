package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-7/PTWhv2oWqd6p4AHB9

Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements
in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible,
and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character
(eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly
one character (false otherwise).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsRearrangement {

    static int maxSize = 0;

    boolean stringsRearrangement(String[] inputArray) {
        maxSize = 0;
        for (int i = 0; i < inputArray.length; ++i) {
            List<Integer> items = new ArrayList<>();
            items.add(i);
            perform(inputArray, items, i);
            if (maxSize == inputArray.length) {
                return true;
            }
        }
        return false;
    }

    public void perform(String[] inputArray, List<Integer> items, int prevElement) {
        for (int k = 0; k < inputArray.length; ++k) {
            if (!items.contains(k)) {
                if (isOneDifferenceInStrings(inputArray[prevElement], inputArray[k])) {
                    List<Integer> newItems = new ArrayList<>(items);
                    newItems.add(k);
                    maxSize = Math.max(maxSize, newItems.size());
                    perform(inputArray, newItems, k);
                }
            }
        }
    }

    boolean isOneDifferenceInStrings(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int n1 = 0;
        int n2 = 0;

        int m = Arrays.mismatch(c1, n1, c1.length, c2, n2, c2.length);
        if(m != -1) {
            n1 = m + 1;
            n2 = m + 1;
            if (Arrays.mismatch(c1, n1, c1.length, c2, n2, c2.length) != -1) {
                return false;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
