package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW

Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise.
 */

public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        while (n > 0) {
            int value = n % 10;
            if (value % 2 != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    boolean evenDigitsOnly2(int n) {
        if (n == 0) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return evenDigitsOnly2(n / 10);
    }
}
