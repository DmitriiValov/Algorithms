package com.robertino.codesignal;

import java.util.HashSet;
import java.util.Set;

public class PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        Set<Character> letters = new HashSet<>();
        for (Character ch : inputString.toCharArray()) {
            if(!letters.remove(ch)) {
                letters.add(ch);
            }
        }
        return letters.size() > 1 ? false : true;
    }
}
