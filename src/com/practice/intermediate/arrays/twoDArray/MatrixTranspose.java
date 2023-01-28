package com.practice.intermediate.arrays.twoDArray;

//You are given a matrix A, you have to return another matrix which is the transpose of A.
//
//NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ;
// Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. The transpose of a matrix switches the element at (i, j)th index to (j, i)th index,
// and the element at (j, i)th index to (i, j)th index.

public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int newRow = A[0].length;
        int newCol = A.length;
        int[][] trans = new int[newRow][newCol];
        for(int i=0;i<newRow;i++){
            for(int j=0;j<newCol;j++){
                trans[i][j] = A[j][i];
            }
        }
        return trans;
    }
}
