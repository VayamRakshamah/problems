package com.practice.intermediate.arrays.twoDArray;

//You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

public class ColumnSum {
    public int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[] res = new int[col];
        for(int j=0;j<col;j++){
            res[j] = 0;
            for(int i=0;i<row;i++){
                res[j]+=A[i][j];
            }
        }
        return res;
    }
}
