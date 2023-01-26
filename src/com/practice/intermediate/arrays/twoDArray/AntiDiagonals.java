package com.practice.intermediate.arrays.twoDArray;

//Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

public class AntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] res = new int[2*N-1][N];
        for(int y = 0;y<N;y++){
            int startX = 0;
            int startY = y;
            int count = 0;
            while(startX<N && startY>=0){
                res[y][count] = A[startX][startY];
                startX++;
                startY--;
                count++;
            }
            while(count<N){
                res[y][count] = 0;
                count++;
            }
        }
        for(int x = 1;x<N;x++){
            int startX = x;
            int startY = N-1;
            int count = 0;
            while(startX<N && startY>=0){
                res[N+x-1][count] = A[startX][startY];
                startX++;
                startY--;
                count++;
            }
            while(count<N){
                res[N+x-1][count] = 0;
                count++;
            }
        }

        return res;

    }
}
