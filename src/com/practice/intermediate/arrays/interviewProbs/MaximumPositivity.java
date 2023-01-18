package com.practice.intermediate.arrays.interviewProbs;

//Given an array of integers A, of size N.
//
//Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.
//
//NOTE: It is guaranteed that an answer always exists.

import java.util.Arrays;

public class MaximumPositivity {
        public int[] solve(int[] A) {
            int len  = A.length;
            int size = 0;
            int maxsize = 0;
            int start = 0;
            int end = 0;
            int[] ans = new int[A.length];
            for(int i=0;i<len;i++){
                if(A[i]>=0){
                    size++;
                    end = i;
                }
                else{
                    size=1;
                    start = i+1;
                    end = start;
                }
                if(size>maxsize){
                    maxsize = size;
                    ans = Arrays.copyOfRange(A, start, end+1);
                }

            }
            return ans ;
        }
}

