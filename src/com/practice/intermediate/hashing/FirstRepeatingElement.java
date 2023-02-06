package com.practice.intermediate.hashing;

//  Given an integer array A of size N, find the first repeating element in it.
//
//We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
//
//If there is no repeating element, return -1.

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> hsA = new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(hsA.containsKey(A.get(i))){
                hsA.put(A.get(i),hsA.get(A.get(i))+1);
            }
            else{
                hsA.put(A.get(i),1);
            }
        }
        for(int i=0;i<A.size();i++){
            if(hsA.containsKey(A.get(i))){
                if(hsA.get(A.get(i))>1){
                    return A.get(i);
                }
            }
        }

        return -1;
    }
}
