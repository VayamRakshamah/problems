package com.practice.intermediate.arrays.subarray;

import java.util.ArrayList;

public class SumOfAllSubarrays  {

    public Long subarraySum(ArrayList<Integer> A) {
        long ans = 0;
        for (int i = 0; i < A.size(); i++) {
            ans += A.get(i)*(i+1)*(A.size()-i);
        }
        return ans;
    }
}
