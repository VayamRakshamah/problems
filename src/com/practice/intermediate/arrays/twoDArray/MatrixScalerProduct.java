package com.practice.intermediate.arrays.twoDArray;


//You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

public class MatrixScalerProduct {
    public int[][] solve(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        for(int i =0;i<rows;i++) {
            for(int j =0;j<cols;j++){
                A[i][j] = B*A[i][j];
            }
        }
        return A;
    }
}
