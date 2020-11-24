package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-3/9DgaPsE2a7M6M2Hu6

Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses
in inputString form a regular bracket sequence.

Guaranteed constraints:
0 ≤ inputString.length ≤ 50.

[output] string

Return inputString, with all the characters that were in parentheses reversed.
 */

public class ReverseInParentheses {

    public static void main(String[] args) {
        String inputString = "foo(bar(baz))blim";
        String result = new ReverseInParentheses().reverseInParentheses(inputString);
        System.out.println(result);
    }

    String reverseInParentheses(String inputString) {
        return calculateString(inputString);
    }

    String calculateString(String inputString) {
        StringBuilder result = new StringBuilder();

        boolean started = false;
        int counter = 0;
        int startIndex = -1;
        int prevStart = 0;
        for (int i = 0; i < inputString.length(); ++i) {
            if(inputString.charAt(i) == '(') {
                if (!started) {
                    result.append(inputString, prevStart, i);
                    started = true;
                    startIndex = i;
                }
                ++counter;
            }
            else if (started && inputString.charAt(i) == ')') {
                --counter;
                if (counter == 0) {
                    StringBuilder str = new StringBuilder(inputString.substring(startIndex + 1, i)).reverse();
                    for(int j = 0; j < str.length(); ++j) {
                        if (str.charAt(j) == '(') {
                            str.setCharAt(j,')');
                        }
                        else if (str.charAt(j) == ')') {
                            str.setCharAt(j,'(');
                        }
                    }
                    result.append(calculateString(str.toString()));
                    started = false;
                    prevStart = i + 1;
                }
            }
        }
        if(prevStart < inputString.length() ) {
            result.append(inputString.substring(prevStart));
        }
        return result.toString();
    }
}
