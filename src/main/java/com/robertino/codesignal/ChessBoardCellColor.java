package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi

Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.



For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.



Input/Output

[execution time limit] 3 seconds (java)

[input] string cell1

Guaranteed constraints:
cell1.length = 2,
'A' ≤ cell1[0] ≤ 'H',
1 ≤ cell1[1] ≤ 8.

[input] string cell2

Guaranteed constraints:
cell2.length = 2,
'A' ≤ cell2[0] ≤ 'H',
1 ≤ cell2[1] ≤ 8.

[output] boolean

true if both cells have the same color, false otherwise.
 */

public class ChessBoardCellColor {

    boolean chessBoardCellColor(String cell1, String cell2) {
        return (cell1.charAt(0) + cell1.charAt(1)) % 2 == (cell2.charAt(0) + cell2.charAt(1)) % 2;
    }
}
