package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM

Some people are standing in a row in a park. There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-1 ≤ a[i] ≤ 1000.

[output] array.integer

Sorted array a with all the trees untouched.

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortByHeight {

    public static void main(String[] args) {
        int[] a = { -1, 150, 190, 170, -1, -1, 160, 180 };
        int[] results = new SortByHeight().sortByHeight(a);
        System.out.println(Arrays.toString(results));
    }

    int[] sortByHeight(int[] a) {
        List<Integer> list = IntStream.of(a).boxed().filter(x -> x != -1).collect(Collectors.toList());
        Collections.sort(list);
        int step = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(step++);
            }
        }
        return a;
    }
}
