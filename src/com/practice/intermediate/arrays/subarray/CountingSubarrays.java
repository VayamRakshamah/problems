package com.practice.intermediate.arrays.subarray;

//Given an array A of N non-negative numbers and a non-negative number B,
//you need to find the number of subarrays in A with a sum less than B.
//We may assume that there is no overflow.

import java.util.ArrayList;

public class CountingSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        for(int j=0;j<N;j++){
            int sum =0;
            for(int i=j;i<N;i++){
                sum+=A.get(i);
                if(sum<B){
                    count++;
                }
            }
        }


        return count;
    }
}



