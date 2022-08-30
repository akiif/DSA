package Arrayss;

//https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix867 {

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
