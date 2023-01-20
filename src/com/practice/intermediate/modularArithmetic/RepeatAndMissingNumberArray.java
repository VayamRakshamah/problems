package com.practice.intermediate.modularArithmetic;

//You are given a read only array of n integers from 1 to n.
//
//Each integer appears exactly once except A which appears twice and B which is missing.
//
//Return A and B.
//
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Note that in your output A should precede B.

public class RepeatAndMissingNumberArray {
    public int[] repeatedNumber(final int[] A) {
        //1. Find the sum and square sum from 1 to n
        //2. FInd the sum actual  and square sum actual from the array
        //3. Use x2-y2  and x+y to find and substitute the values

        int[] res = new int[2];

        long N  = A.length;
        long sumN = N*(N+1)/2;
        long actSum = 0;
        long sumN2 = N*(N+1)*(2*N+1)/6;
        long actSum2 = 0;

        for(int i=0; i<N;i++){
            actSum +=A[i];
            actSum2+=((long)A[i]*A[i]);
        }
        //M --missing and D -- duplicate
        long MminusD = sumN - actSum;
        long M2minusD2 = sumN2 - actSum2;
        long MplusD = M2minusD2/MminusD;

        long M = (MminusD+MplusD)/2;
        long D = M - MminusD;
        res[0] = (int)D;
        res[1] = (int)M;

        return res;
    }
}
