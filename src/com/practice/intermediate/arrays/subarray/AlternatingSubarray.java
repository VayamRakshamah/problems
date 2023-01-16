package com.practice.intermediate.arrays.subarray;

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
