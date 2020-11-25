package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1
 */

import java.util.Arrays;

public class AddBorder {

    public static void main(String[] args) {
        String[] picture = { "abc", "ded" };
        String[] results = new AddBorder().addBorder(picture);
        System.out.println(Arrays.toString(results));
    }

    String[] addBorder(String[] picture) {
        int size = picture[0].length();
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < size + 2; ++i) {
            border.append('*');
        }
        String[] results = new String[picture.length + 2];
        results[0] = border.toString();
        results[picture.length + 1] = border.toString();
        for(int i = 0; i < picture.length; ++i) {
            StringBuilder str = new StringBuilder("*");
            str.append(picture[i]).append('*');
            results[i + 1] = str.toString();
        }
        return results;
    }
}
