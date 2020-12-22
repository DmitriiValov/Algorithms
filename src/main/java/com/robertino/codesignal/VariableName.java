package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-6/6Wv4WsrsMJ8Y2Fwno

Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
variableName(name) = true;
For name = "qq-q", the output should be
variableName(name) = false;
For name = "2w2", the output should be
variableName(name) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] string name

Guaranteed constraints:
1 ≤ name.length ≤ 10.

[output] boolean

true if name is a correct variable name, false otherwise.
 */

public class VariableName {

    boolean variableName(String name) {
        return name.matches("^[_a-zA-Z][a-zA-Z_$0-9]*");
    }
}
