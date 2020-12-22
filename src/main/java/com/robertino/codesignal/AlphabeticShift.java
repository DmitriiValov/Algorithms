package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-6/PWLT8GBrv9xXy4Dui

Given a string, your task is to replace each of its characters by the next one in the English alphabet;
i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 1000.

[output] string

The resulting string after replacing each of its characters.
 */

public class AlphabeticShift {

    String alphabeticShift(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == 'z') {
                result.append('a');
            }
            else {
                char c = inputString.charAt(i);
                result.append(++c);
            }
        }
        return result.toString();
    }

    String alphabeticShift2(String inputString) {
        char[] ss = inputString.toCharArray();
        for (int i = 0; i < ss.length; ++i) {
            ss[i]++;
            if (ss[i] > 'z')
                ss[i] = 'a';
        }
        return new String(ss);
    }
}
