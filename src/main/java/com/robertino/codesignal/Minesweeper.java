package com.robertino.codesignal;

/*
https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM

In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a
number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement
of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.boolean matrix

A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false
otherwise.

Guaranteed constraints:
2 ≤ matrix.length ≤ 100,
2 ≤ matrix[0].length ≤ 100.

[output] array.array.integer

Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in
the neighboring cells. Two cells are called neighboring if they share at least one corner.
 */

public class Minesweeper {

    int[][] minesweeper(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                result[i][j] = calculate(matrix, i, j);
            }
        }
        return result;
    }

    int calculate(boolean[][] matrix, int x, int y) {
        int sum = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j <= y+1; j++) {
                if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length) {
                    if (matrix[i][j] && (i != x || j != y)) {
                        ++sum;
                    }
                }
            }
        }
        return sum;
    }
}
