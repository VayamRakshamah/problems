package com.practice.intermediate.hashing;

//You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
//
//Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
//
//NOTE: if B > N, return an empty array.

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        if (B > A.size()) {
            return new ArrayList<>();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            //increase key
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
            if (i - B + 1 >= 0) {
                //decrease key
                result.add(map.size());
                map.put(A.get(i - B + 1), map.get(A.get(i - B + 1)) - 1);

                //remove if count becomes 0
                if (map.get(A.get(i - B + 1)) == 0) {
                    map.remove(A.get(i - B + 1));
                }
            }
        }
        return result;
    }
}
