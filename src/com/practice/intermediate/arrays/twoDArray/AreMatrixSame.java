package com.practice.intermediate.arrays.twoDArray;

//You are given two matrices A & B of equal dimensions and you have to check whether two matrices are equal or not.

public class AreMatrixSame {
    public int solve(int[][] A, int[][] B) {
        int row = A.length;
        int col = A[0].length;
        //given A and B have same dimesions
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(A[i][j] == B[i][j]){
                    continue;
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
