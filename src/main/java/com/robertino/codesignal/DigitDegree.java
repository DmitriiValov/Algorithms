package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-9/hoLtYWbjdrD2PF6yo

Let's define digit degree of some positive integer as the number of times we need to replace this number with the
sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

[output] integer
 */

public class DigitDegree {

    int digitDegree(int n) {
        if (n < 10) return 0;
        int steps = 0;
        do {
            int sum = 0;
            while(n > 0) {
                sum += n%10;
                n = n / 10;
            }
            n = sum;
            ++steps;
        }
        while (n > 9);
        return steps;
    }
}
