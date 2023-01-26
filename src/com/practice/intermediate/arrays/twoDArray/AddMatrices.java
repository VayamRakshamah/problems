package com.practice.intermediate.arrays.twoDArray;

//You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.

public class AddMatrices {
    public int[][] solve(int[][] A, int[][] B) {
        int x = A.length;
        int y = A[0].length;
        int[][] C = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        return C;
    }
}
