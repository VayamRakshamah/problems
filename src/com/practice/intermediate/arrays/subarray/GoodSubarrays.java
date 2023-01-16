package com.practice.intermediate.arrays.subarray;

import java.util.ArrayList;

public class GoodSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        for(int j=0;j<N;j++){
            int sum =0;
            int len = 0;
            for(int i=j;i<N;i++){
                sum+=A.get(i);
                len++;
                if((len%2==0 && sum<B) || (len%2!=0 && sum>B)){
                    count++;
                }
            }
        }
        return count;
    }
}
