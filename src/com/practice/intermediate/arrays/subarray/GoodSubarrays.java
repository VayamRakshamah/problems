package com.practice.intermediate.arrays.subarray;

//Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
//1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
//2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//Your task is to find the count of good subarrays in A.

import java.util.ArrayList;

public class GoodSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        for(int j=0;j<N;j++){
            int sum =0;
            int len = 0;
            for(int i=j;i<N;i++){
                sum+=A.get(i);
                len++;
                if((len%2==0 && sum<B) || (len%2!=0 && sum>B)){
                    count++;
                }
            }
        }
        return count;
    }
}
