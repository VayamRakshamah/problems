package com.practice.intermediate.arrays.twoDArray;

//You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.

public class RowSum {
    public int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[] sumRows = new int[row];
        for (int i = 0; i < row; i++){
            int sum = 0;
            for (int j = 0; j < col; j++){
                sum += A[i][j];
            }
            sumRows[i]=sum;
        }
        return sumRows;

    }
}
