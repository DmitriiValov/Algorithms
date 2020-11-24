package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32

Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
 */

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        int result = new CommonCharacterCount().commonCharacterCount(s1, s2);
        System.out.println(result);
    }

    int commonCharacterCount(String s1, String s2) {
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); ++i) {
            if(map.containsKey(s1.charAt(i))) {
                int value = map.get(s1.charAt(i));
                map.put(s1.charAt(i), ++value);
            }
            else {
                map.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); ++i) {
            if(map.containsKey(s2.charAt(i))) {
                int value = map.get(s2.charAt(i));
                if(value > 0) {
                    ++counter;
                    map.put(s2.charAt(i), --value);
                }
            }
        }
        return counter;
    }
}
