package Algorithms.BinarySearch.Matrix_2D;

//Here it is sorted row-wise

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    public static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious matrix may be empty


        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int midCol = cols / 2;
        // run the loop till 2 rows are remaining
        while( rowStart < (rowEnd - 1)) {  //while this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }

            if (matrix[mid][midCol] < target) {
                 rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // Now we have two rows
        // Check whether the target is in the column of the 2 rows

        if (matrix[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        } else if (matrix[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }

        // search in 1st half
        if (target <= matrix[rowStart][midCol - 1]) {
            return binarySearch(matrix, rowStart, 0, midCol - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][midCol + 1]  && (target <= matrix[rowStart][cols - 1])) {
            return binarySearch(matrix, rowStart, midCol + 1, cols - 1, target);
        }

        // search in 3rd half
        if (target <= matrix[rowStart + 1][midCol - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, midCol - 1, target);
        }
        // search in 4th half
        if (target >= matrix[rowStart + 1][midCol - 1]  && (target <= matrix[rowStart + 1][cols - 1])) {
            return binarySearch(matrix, rowStart + 1, midCol + 1, cols - 1, target);
        }


        return new int[]{-1, -1};
    }

    // search in the row provided between the columns provided
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while(cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
