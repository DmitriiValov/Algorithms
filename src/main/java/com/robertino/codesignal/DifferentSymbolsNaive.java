package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-8/8N7p3MqzGQg5vFJfZ

Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer
 */

import java.util.stream.Collectors;

public class DifferentSymbolsNaive {

    int differentSymbolsNaive(String s) {
        return s.chars().mapToObj(e->(char)e).collect(Collectors.toSet()).size();
    }

    int differentSymbolsNaive2(String s) {
        return (int) s.chars().distinct().count();
    }
}
