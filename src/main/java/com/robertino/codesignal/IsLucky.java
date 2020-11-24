package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ

Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.

 */

import java.util.ArrayList;
import java.util.List;

public class IsLucky {

    public static void main(String[] args) {
        boolean result = new IsLucky().isLucky(1405);
        System.out.println(result);
    }

    boolean isLucky(int n) {
        List<Integer> results = new ArrayList<>();
        while(n > 0) {
            results.add(n%10);
            n = n / 10;
        }
        int a1 = 0;
        int a2 = 0;
        for(int i = 0; i < results.size(); ++i) {
            if(i < results.size() / 2) {
                a1 += results.get(i);
            }
            else {
                a2 += results.get(i);
            }
        }
        return a1 == a2;
    }
}
