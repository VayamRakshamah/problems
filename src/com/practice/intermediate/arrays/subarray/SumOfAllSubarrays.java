package com.practice.intermediate.arrays.subarray;

//You are given an integer array A of length N.
//You have to find the sum of all subarray sums of A.
//More formally, a subarray is defined as a contiguous part of an array
// which we can obtain by deleting zero or more elements from either end of the array.
//A subarray sum denotes the sum of all the elements of that subarray.

import java.util.ArrayList;

public class SumOfAllSubarrays  {

    public Long subarraySum(ArrayList<Integer> A) {
        long ans = 0;
        for (int i = 0; i < A.size(); i++) {
            ans += A.get(i)*(i+1)*(A.size()-i);
        }
        return ans;
    }
}
