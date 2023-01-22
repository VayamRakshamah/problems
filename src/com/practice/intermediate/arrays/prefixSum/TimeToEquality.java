package com.practice.intermediate.arrays.prefixSum;

//Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//
//Find the minimum time in seconds to make all elements of the array equal.

public class TimeToEquality {
    public int solve(int[] A) {
        int len = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<len;i++){
            if(A[i]>max){
                max = A[i];
            }
            sum=sum+A[i];
        }
        return max*len-sum;
    }
}
