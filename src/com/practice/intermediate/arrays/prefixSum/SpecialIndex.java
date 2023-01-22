package com.practice.intermediate.arrays.prefixSum;

//Given an array, arr[] of size N,
// the task is to find the count of array indices such that removing an element
// from these indices makes the sum of even-indexed and odd-indexed array elements equal.

public class SpecialIndex {
    public int solve(int[] A) {
        int len = A.length;
        int[] PSEven = new int[len];
        int[] PSOdd = new int[len];
        int count = 0;
        int sumEven=0;
        int sumOdd=0;

        for(int i=0;i<len;i++){
            if(i==0){
                PSEven[i]=A[i];
                PSOdd[i]=0;
            }
            else if(i%2==0){
                PSEven[i] = PSEven[i-1]+A[i];
                PSOdd[i] = PSOdd[i-1];
            }
            else{
                PSOdd[i] = PSOdd[i-1]+A[i];
                PSEven[i] = PSEven[i-1];
            }
        }

        for(int i=0;i<len;i++){
            if(i==0){
                sumEven = PSOdd[len-1]-PSOdd[i];
                sumOdd = PSEven[len-1]-PSEven[i];
            }
            else{
                sumEven = PSEven[i-1]+PSOdd[len-1]-PSOdd[i];
                sumOdd = PSOdd[i-1]+PSEven[len-1]-PSEven[i];
            }

            if(sumEven == sumOdd){
                count++;
            }
        }

        return count;
    }
}
