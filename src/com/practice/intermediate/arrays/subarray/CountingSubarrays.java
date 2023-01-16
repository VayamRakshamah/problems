package com.practice.intermediate.arrays.subarray;

import java.util.ArrayList;

public class CountingSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        for(int j=0;j<N;j++){
            int sum =0;
            for(int i=j;i<N;i++){
                sum+=A.get(i);
                if(sum<B){
                    count++;
                }
            }
        }


        return count;
    }
}



