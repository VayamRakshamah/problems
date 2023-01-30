package com.practice.intermediate.arrays.carryForward;

//You are given an integer array A.
//
//Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
//
//Return "YES" if it is possible; otherwise, return "NO" (without quotes).

import java.util.ArrayList;

public class EvenSubarrays {
    public String solve(ArrayList<Integer> A) {
        if((A.size()%2!=0) || A.get(0)%2!=0 || A.get(A.size()-1)%2!=0 ){
            return "NO";
        }
        else{
            return "YES";
        }
    }
}
