package com.practice.intermediate.arrays.subarray;

//You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
//But the sum must not exceed B.

public class MaximumSubarray {
    public int maxSubarray(int A, int B, int[] C) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int j = 0;
        for(int i=0;i<A;i++){
            sum+=C[i];
            if(sum>B){
                while(sum>B){
                    sum = sum-C[j];
                    j++;
                }
            }
            if(sum<=B){
                maxSum = Math.max(maxSum,sum);
            }
        }
        if(maxSum == Integer.MIN_VALUE){
            return 0;
        }
        else{
            return maxSum;
        }
    }
}
