package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-5/veW5xJednTy4qcjso

An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer
network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus
two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.

Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of digits, full stops and lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 30.

[output] boolean

true if inputString satisfies the IPv4 address naming rules, false otherwise.
 */


public class IsIPv4Address {

    boolean isIPv4Address(String inputString) {
        String[] groups = inputString.split("\\.");
        if(groups.length == 4) {
            for (String group : groups) {
                try {
                    Integer value = Integer.parseInt(group);
                    if (value < 0 || value > 255) {
                        return false;
                    }
                    else if (group.length() != value.toString().length()) {
                        return false;
                    }
                }
                catch (Exception ex) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }

    boolean isIPv4Address2(String inputString) {
        return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }
}
