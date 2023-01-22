package com.practice.intermediate.arrays.prefixSum;

//You are given an integer array A of length N.
//You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] PS = new long[A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++){
            PS[i] = PS[i-1]+A[i];
        }
        long[] sum = new long[B.length];
        for(int i=0;i<B.length;i++){
            if(B[i][0]==1){
                sum[i] = PS[B[i][1]-1];
            }
            else{
                sum[i] = PS[B[i][1]-1] - PS[B[i][0]-2];
            }

        }

        return sum;
    }
}
