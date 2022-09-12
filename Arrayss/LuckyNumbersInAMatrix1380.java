package Arrayss;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix1380 {

    public static void main(String[] args) {
        int[][] matrix =
                {
                    {3,7,8},
                    {9,11,13},
                    {15,16,17}
                };
        System.out.println(luckyNumbers(matrix));

        System.out.println("--------------------------------------------");

        int[][] matrix2 =
                {
                    {1,10,4,2},
                    {9,3,8,7},
                    {15,16,17,12}
                };
        System.out.println(luckyNumbers(matrix2));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix, row);
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }

        return result;
    }

    private static int minColInRow(int[][] matrix, int row) {
        int minIndex = 0, min = matrix[row][minIndex];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }

    private static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }
}
