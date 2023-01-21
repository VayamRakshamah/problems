package com.practice.intermediate.arrays.prefixSum;

//Given an array of integers A, find and return the product array of the same size
// where the ith element of the product array will be equal to the product of all the elements
// divided by the ith element of the array.
//
//Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int product=1;
        for(int i=0;i<len;i++){
            product = product *A[i];
        }
        for(int i=0;i<len;i++){
            res[i] = product/A[i];
        }
        return res;
    }
}
