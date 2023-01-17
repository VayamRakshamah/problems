package com.practice.intermediate.arrays.twoDArray;

//You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
// Specifically, make entire ith row and jth column zero.

import java.util.Arrays;

public class RowToColumnZero {
    public int[][] solve(int[][] A) {
        //make a list of i and j every time you encounter a 0
        //then run the loop for those values and negate
        int row = A.length;
        int col = A[0].length;

        int[] rowArray = new int[row];
        Arrays.fill(rowArray,-1);
        int[] colArray = new int[col];
        Arrays.fill(colArray,-1);

        //lists of rows and columns to be made zero
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(A[i][j]==0){
                    rowArray[i]=1;
                    colArray[j]=1;
                }
            }
        }

        // Make full row as 0 for each row where value is 1 in rowArray
        for(int i =0;i<rowArray.length;i++){
            if(rowArray[i]==1){
                for (int j =0; j<col;j++){
                    A[i][j] = 0;
                }
            }
        }
        // Make full col as 0 for each col where value is 1 in colArray

        for(int j =0;j<colArray.length;j++){
            if(colArray[j]==1){
                for (int i =0; i<row;i++){
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
