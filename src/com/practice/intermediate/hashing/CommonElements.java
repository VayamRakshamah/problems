package com.practice.intermediate.hashing;

//Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
//
//NOTE:
//
//Each element in the result should appear as many times as it appears in both arrays.
//The result can be in any order.

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hsA = new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(hsA.containsKey(A.get(i))){
                hsA.put(A.get(i),hsA.get(A.get(i))+1);
            }
            else{
                hsA.put(A.get(i),1);
            }
        }

        for(int i=0;i<B.size();i++){
            if(hsA.containsKey(B.get(i))){
                result.add(B.get(i));
                hsA.put(B.get(i),hsA.get(B.get(i))-1);
                if(hsA.get(B.get(i))==0){
                    hsA.remove(B.get(i));
                }
            }
        }

        return result;

    }
}
