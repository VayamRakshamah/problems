package com.practice.intermediate.arrays.carryForward;

//Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//
//An element is a leader if it is strictly greater than all the elements to its right side.
//
//NOTE:The rightmost element is always a leader.

public class LeadersInArray {
    public int[] solve(int[] A) {
        int len = A.length;
        int[] RM = new int[len];
        //int [] RES = new int[len];
        int count = 1;

        RM[len-1] = A[len-1];
        for(int i=len-2;i>=0;i--){
            RM[i] = Math.max(RM[i+1],A[i]);
        }
        int j = 0;
        for(int i=len-2;i>=0;i--){
            if(A[i]>RM[i+1]){
                count++;
            }
        }
        int[] RES = new int[count];
        for(int i=len-2;i>=0;i--){
            if(A[i]>RM[i+1]){
                RES[j]=A[i];
                j++;
            }


        }
        RES[j]=A[len-1];

        return RES;
    }
}
