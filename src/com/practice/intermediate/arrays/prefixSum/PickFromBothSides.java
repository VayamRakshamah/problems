package com.practice.intermediate.arrays.prefixSum;

//You are given an integer array A of size N.
//
//You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
//
//Find and return this maximum possible sum.
//
//NOTE: Suppose B = 4, and array A contains 10 elements, then
//
//You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.

public class PickFromBothSides {
    public int solve(int[] A, int B) {
        int max = Integer.MIN_VALUE;
        int ref;
        int len = A.length;
        int[] PS=new int[len];
        for(int i=0;i<len;i++){
            if(i==0){
                PS[i]=A[i];
            }
            else{
                PS[i]=PS[i-1]+A[i];
            }
        }

        if(B==len){
            return PS[len-1];
        }
        max = PS[len-1]-PS[len-B-1];
        for(int i=B-1;i>=0;i--){
            ref=PS[i]+PS[len-1]-PS[len-B+i];
            if(ref>max){
                max = ref;
            }
        }
        return max;
    }
}
