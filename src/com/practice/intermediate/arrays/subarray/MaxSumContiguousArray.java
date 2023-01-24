package com.practice.intermediate.arrays.subarray;

//Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.

import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousArray {

    public  static int maxSubArray(final List<Integer> A) {
        int currMax = Integer.MIN_VALUE;
        for (int i = 0;i<A.size();i++){
            int sum =0;
            for(int j = 0;j<A.size();j++){
                sum+=A.get(j);
                currMax = Math.max(currMax,sum);
            }
        }
        return currMax;
    }

    public static void main(String[] args) {
        List<Integer> Alist= Arrays.asList(-1,2,1,3,4,5);
        System.out.println(maxSubArray(Alist));
    }
}
