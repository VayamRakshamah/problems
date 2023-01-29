package com.practice.intermediate.arrays.carryForward;

//Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//
//and at least one occurrence of the minimum value of the array.

public class ClosestMinMax {
    public int solve(int[] A) {
        int len = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int latestMIN = Integer.MIN_VALUE;
        int latestMAX = Integer.MIN_VALUE;
        long ans = Integer.MAX_VALUE;

        for(int i=0;i<len;i++){
            if(A[i]>max){
                max = A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }

        for(int i=0;i<len;i++){
            if(A[i] == max){
                latestMAX = i;
                ans = Math.min(ans,i-(long)latestMIN+1);
            }
            if(A[i] == min){
                latestMIN = i;
                ans = Math.min(ans,i-(long)latestMAX+1);
            }

        }
        return (int)ans;
    }
}
