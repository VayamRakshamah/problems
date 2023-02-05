package com.practice.intermediate.hashing;

//Given an array A of integers and another non negative integer B .
//
//Find if there exists 2 indices i and j such that A[i] - A[j] = B and i != j.

import java.util.HashMap;
import java.util.List;

public class DiffkTwo {
    public int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> hm  =  new HashMap<Integer,Integer>();
        //Create a frequency hashmap
        for(int i=0;i<A.size();i++){
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i),hm.get(A.get(i))+1);
            }
            else{
                hm.put(A.get(i),1);
            }
        }

        for(int i=0;i<A.size();i++){
            int b = A.get(i);
            int a = B+b;
            if(a==b){
                if(hm.get(a)>1){
                    return 1;
                }
            }
            else{
                if(hm.containsKey(a)){
                    return 1;
                }
            }
        }
        return 0;
    }
}
