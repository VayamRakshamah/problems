package com.practice.intermediate.arrays.twoDArray;

import java.util.ArrayList;

//Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order
// and return the generated square matrix.

public class SpiralMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < A; j++) {
                matrix.get(i).add(0);
            }
        }

        int num = 1;
        int top = 0;
        int bottom = A-1;
        int left = 0;
        int right = A-1;

        while(num<=A*A){
            for(int i=left;i<=right;i++){
                matrix.get(top).set(i,num++);
            }
            top++;
            for(int j = top;j<=bottom;j++){
                matrix.get(j).set(right,num++);
            }
            right--;
            for(int k =right;k>=left;k--){
                matrix.get(bottom).set(k,num++);
            }
            bottom--;
            for(int l = bottom;l>=top;l++){
                matrix.get(l).set(left,num++);
            }
            left++;
        }
        return  matrix;
    }
}
