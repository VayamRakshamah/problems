package com.practice.intermediate.arrays.subarray;

//You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
//
//You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.
//
//A 0-1 alternating array is an array containing only 0's & 1's,
// and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating,
// while [1, 1] and [0, 1, 0, 0, 1] are not.

import java.util.ArrayList;

public class AlternatingSubarray {
    public class Solution {
        public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

            ArrayList<Integer> indices = new ArrayList<Integer>();
            for (int i = 0; i < A.size();i++){
                int checkCount = 0;
                int temp = B;
                //edge case
                if(i==0 || i== A.size()-1){
                    if(B==0){
                        indices.add(i);
                    }
                }
                else{
                    //base case
                    while(temp>0){
                        if(i-temp>=0 && i+temp<=A.size()-1){
                            if((A.get(i-temp)==A.get(i+temp)) && A.get(i-temp)!=A.get(i-temp+1)){
                                checkCount++;
                            }
                        }
                        temp--;
                    }
                    if(checkCount==B){
                        indices.add(i);
                    }
                }

            }
            return indices;
        }
    }

}
