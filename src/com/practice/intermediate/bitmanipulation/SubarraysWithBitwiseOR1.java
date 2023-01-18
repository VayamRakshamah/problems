package com.practice.intermediate.bitmanipulation;

//Given an array B of length A with elements 1 or 0.
// Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.

public class SubarraysWithBitwiseOR1 {
    public long solve(int A, int[] B) {
        int subArraysAtI = 0;
        int result = 0;

        for (int i = 0; i < A; i++) {
            if (B[i] == 1) {
                subArraysAtI = i + 1;
            }
            result = result + subArraysAtI;
        }
        return result;
    }


}
