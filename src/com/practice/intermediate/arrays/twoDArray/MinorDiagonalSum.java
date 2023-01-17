package com.practice.intermediate.arrays.twoDArray;

//You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
//
//Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

public class MinorDiagonalSum {
    public int solve(final int[][] A) {
        int sum = 0;
        int n = A.length;
        int i = 0;
        int j = n-1;
        while(i<n && j>=0){
            sum += A[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
