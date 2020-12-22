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
        return (charToInt(cell1.charAt(0)) + Integer.parseInt(String.valueOf(cell1.charAt(1)))) % 2 ==
                (charToInt(cell2.charAt(0)) + Integer.parseInt(String.valueOf(cell2.charAt(1)))) % 2;
    }

    int charToInt(char c) {
        if(c == 'A') return 1;
        else if(c == 'B') return 2;
        else if(c == 'C') return 3;
        else if(c == 'D') return 4;
        else if(c == 'E') return 5;
        else if(c == 'F') return 6;
        else if(c == 'G') return 7;
        else if(c == 'H') return 8;
        else return 0;
    }
}
