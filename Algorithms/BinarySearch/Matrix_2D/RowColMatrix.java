package Algorithms.BinarySearch.Matrix_2D;

/*
Here the matrix is row-wise and col-wise sorted which means that if we pick
any row/col that particular row/col will be sorted.
*/

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 37;

        int[] res = search(matrix, target);
        if(res[0] > -1) {
            System.out.println("The target has been found at: " + Arrays.toString(res));
        } else {
            System.out.println("The target does not exists in the matrix.");
        }
    }

    //It also works for mxn matrix. Just add the col length of the last row
    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }

}
