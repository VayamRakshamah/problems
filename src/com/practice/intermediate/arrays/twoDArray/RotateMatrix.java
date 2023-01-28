package com.practice.intermediate.arrays.twoDArray;

//You are given a n x n 2D matrix A representing an image.
//
//Rotate the image by 90 degrees (clockwise).
//
//You need to do this in place.
//
//Note: If you end up using an additional array, you will only receive partial score.

public class RotateMatrix {
    public void solve(int[][] A) {
        int N = A.length;
        int temp =0;
        for(int i =0 ; i<N;i++){
            for(int j=i+1;j<N;j++){
                if(i!=j){
                    temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<=(N-1)/2;j++){
                temp = A[i][j];
                A[i][j] = A[i][N-j-1];
                A[i][N-j-1] = temp;
            }
        }
    }
}
