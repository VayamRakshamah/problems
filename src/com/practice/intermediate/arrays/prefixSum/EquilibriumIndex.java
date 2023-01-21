package com.practice.intermediate.arrays.prefixSum;

//You are given an array A of integers of size N.
//
//Your task is to find the equilibrium index of the given array
//
//The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//
//NOTE:
//
//Array indexing starts from 0.
//If there is no equilibrium index then return -1.
//If there are more than one equilibrium indexes then return the minimum index.

public class EquilibriumIndex {
    public int solve(int[] A) {
        int[] PS=new int[A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++){
            PS[i] = PS[i-1]+A[i];
        }

        int SumL=0;
        int SumR=0;
        int countEquilibrium=A.length;
        for(int j = 0;j<=A.length-1;j++){
            if(j==0){
                SumL = 0;
            }
            else{
                SumL = PS[j-1];
            }
            SumR = PS[A.length-1]-PS[j];
            if(SumL == SumR){
                if(j<=countEquilibrium){
                    countEquilibrium=j;
                }
            }
        }

        if(countEquilibrium==A.length){
            return -1;
        }
        else{
            return countEquilibrium;
        }
    }
}
