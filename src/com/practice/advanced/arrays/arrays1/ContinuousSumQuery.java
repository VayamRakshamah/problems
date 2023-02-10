package com.practice.advanced.arrays.arrays1;

//There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
//
//Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
//For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B
//
//
//Problem Constraints
//
//1 <= A <= 2 * 105
//1 <= L <= R <= A
//1 <= P <= 103
//0 <= len(B) <= 105
//
//
//Input Format
//
//The first argument is a single integer A.
//The second argument is a 2D integer array B.
//
//
//Output Format
//
//Return an array(0 based indexing) that stores the total number of coins in each beggars pot.

import java.util.ArrayList;

public class ContinuousSumQuery {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> res = new ArrayList<Integer>(A);
        for(int i = 0; i < A; i++){
            res.add(0);
        }
        int n = B.size();
        while(n>0){
            int i = B.get(n-1).get(0);
            int j = B.get(n-1).get(1);
            res.set(i-1,res.get(i-1)+B.get(n-1).get(2));
            if(j<A){
                res.set(j,res.get(j)-B.get(n-1).get(2));
            }
            n--;
        }
        for(int i =1;i<A;i++){
            res.set(i,res.get(i)+res.get(i-1));
        }
        return res;
    }
}
