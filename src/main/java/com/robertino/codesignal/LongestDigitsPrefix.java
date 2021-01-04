package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-9/AACpNbZANCkhHWNs3

Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.

[output] string
 */

import static java.lang.Character.isDigit;

public class LongestDigitsPrefix {

    String longestDigitsPrefix(String inputString) {
        int i = 0;
        while (isDigit(inputString.toCharArray()[i])) {
            if(++i >= inputString.length()) {
                break;
            }
        }
        return inputString.substring(0, i);
    }
}
