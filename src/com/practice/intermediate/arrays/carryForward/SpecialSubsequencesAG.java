package com.practice.intermediate.arrays.carryForward;

//You have given a string A having Uppercase English letters.
//
//You have to find how many times subsequence "AG" is there in the given string.
//
//NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

public class SpecialSubsequencesAG {
    public int solve(String A) {
        int len = A.length();
        int ans = 0;
        int count_A = 0;
        for(int i=0;i<len;i++){
            if(A.charAt(i)=='A'){
                count_A++;
            }
            else if(A.charAt(i)=='G'){
                ans+=count_A;
            }
        }

        return ans%((int)Math.pow(10,9)+7);
    }
}
